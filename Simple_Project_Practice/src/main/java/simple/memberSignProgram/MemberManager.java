package simple.memberSignProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManager {

    // 사용자가 입력을 받아야 하므로 Scanner 사용
    Scanner sc = new Scanner(System.in);

    // List<> 변수명 = new ArrayList<>();
    // List 제네릭을 사용하여 <클래스명>에 있는 데이터 값을 사용하여 배열 형태로 저장
    List<MemberDTO> save = new ArrayList<>();


    // 회원등록을 위한 메소드
    public void MemberSign(){

        System.out.print("등록할 회원번호 입력 : ");
        int no = sc.nextInt();

        sc.nextLine();
        System.out.print("등록할 회원이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("등록할 아이디 입력 : ");
        String id = sc.nextLine();
        System.out.print("등록할 비밀번호 입력 : ");
        String pwd = sc.nextLine();

        // MemberDTO 클래스를 사용하여 데이터 값 설정 및 추출
        MemberDTO memberDTO = new MemberDTO();

        // MemberDTO 클래스에 setter로 데이터값 설정
        memberDTO.setNo(no);
        memberDTO.setName(name);
        memberDTO.setId(id);
        memberDTO.setPwd(pwd);

        // 데이터 값을 save 변수에 저장
        save.add(memberDTO);

        // 등록되었다는 문구 출력
        System.out.println(name + "님이 등록되었습니다..");

        // 추가 등록 및 조회 확인
        System.out.print("추가 등록을 원하시면 1번, 현재까지 저장된 회원목록은 2번 : ");
        int selectNo = sc.nextInt();


        switch (selectNo){
            case 1:
                // 1번 선택 시 다시 MemberSign 메소드 호출
                MemberSign();
                break;
            case 2:
                // 2번 선택 시 searchMembers 메소드 호출하여 저장된 목록 출력
                searchMembers();
                break;
            default:
                System.out.println("메뉴에 맞는 번호로만 입력해주세요...");
                break;
        }

    }

    // 회원목록 조회를 위한 searchMembers 메소드 설정
    public void searchMembers(){

        // 만약 save에 저장된 값이 없다면 true를 반환하여 등록된 회원이 없다고 안내문구 출력
        if (save.isEmpty()){
            System.out.println("현재 등록된 회원이 없습니다. 회원등록을 먼저 해주세요");
            // 데이터가 없다면 MemberSign 메소드로 이동하여 등록하도록 하기
            MemberSign();

        } else {
            // save에 저장된 값이 있다면 false로 반환하여 향상된 for 문으로
            // MemberDTO 클래스에서 선언한 saveMembers 변수에 저장된 값 하나씩 저장하여 목록 보여주기
            System.out.println("===========현재 등록된 회원목록===========");
            for (MemberDTO saveMembers : save){
                System.out.println(saveMembers);
            }
        }

        // 저장된 데이터값을 출력해준 뒤 추가적인 요구사항 선택할 수 있도록 사용자 입력 구문 출력
        System.out.print("추가 등록을 원한다면 1번, 프로그램 종료를 원한다면 0번 : ");
        int no = sc.nextInt();

        // 입력한 정수값(no) 값이
        // 만약 1과 같다면 다시 회원등록 메소드로 돌아가게 함
        if (no == 1){
            MemberSign();
        }
        // 만약 0번을 누르게 되면 프로그램 종료 System.exit(no);
        else if (no == 0){
            System.exit(no);
        }

    }

}
