package simple.memberSignProgram;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. 간단한 회원등록 프로그램 */

        // 사용자 입력을 받아야 하므로 Scanner 사용
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        System.out.println("=========간단한 회원 등록 프로그램=========");
        System.out.println("1. 회원등록 및 즉시 회원조회");
        System.out.println("2. 저장된 회원목록");
        System.out.println("0. 프로그램 종료");
        System.out.print("원하시는 메뉴번호 선택 : ");
        int no = sc.nextInt();

        // while(true)를 통해 사용자가 프로그램 종료 선택 전까지 무한루프 설정
        while (true){

            // 선택한 번호 기준으로 메소드 실행을 위해 switch 문 사용
            switch (no){
                case 1:
                    manager.MemberSign();
                    break;
                case 2:
                    manager.searchMembers();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다...메뉴에 맞는 번호를 입력해주세요!!");
            }


        }

    }

}
