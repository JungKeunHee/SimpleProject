package simple.RpsGame;

import java.util.Scanner;

public class Win {

    Scanner sc = new Scanner(System.in);
    FirstMonsterInfo first = new FirstMonsterInfo();
    SecondMonsterInfo second = new SecondMonsterInfo();
    ThirdMonsterInfo third = new ThirdMonsterInfo();
    SaveMonsters save = new SaveMonsters();
    Attack at = new Attack();

    // 플레이어가 첫 번째 몬스터한테 승리 시 호출
    public void firstWin() {
        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(first.getName()); // 저장 선택 시 SaveMonsters 클래스에 저장
            System.out.println(first.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(first.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + first.getName() + "이 도망갔습니다");
        }

        showMenu(); // 다른 몬스터와 대결, 저장(도감) 확인, 프로그램 종료 메뉴 호출
    }

    // 플레이어가 두 번째 몬스터한테 승리 시 호출
    public void secondWin() {
        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(second.getName()); // 저장 선택 시 SaveMonsters 클래스에 저장
            System.out.println(second.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(second.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + second.getName() + "이 도망갔습니다");
        }

        showMenu(); // 다른 몬스터와 대결, 저장(도감) 확인, 프로그램 종료 메뉴 호출
    }

    // 플레이어가 세 번째 몬스터한테 승리 시 호출
    public void thirdWin() {

        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(third.getName()); // 저장 선택 시 SaveMonsters 클래스에 저장
            System.out.println(third.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(third.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + third.getName() + "이 도망갔습니다");
        }

        showMenu(); // 다른 몬스터와 대결, 저장(도감) 확인, 프로그램 종료 메뉴 호출

    }

    // 다른 몬스터와 대결, 저장(도감) 확인, 프로그램 종료 선택메뉴
    public void showMenu() {
        System.out.println("[메뉴 1번] 다른 몬스터 사냥하러 가기");
        System.out.println("[메뉴 2번] 현재까지 포획한 몬스터 도감 확인");
        System.out.println("[메뉴 0번] 프로그램 종료");
        System.out.print("[메뉴 번호를 선택해주세요] : ");
        int no2 = sc.nextInt();

        switch (no2) {
            case 1:
                at.attack();
                break;
            case 2:
                SaveMonsters();
                break;
            case 0:
                System.out.println("프로그램을 종료합니다..");
                System.exit(0);
                break;
            default:
                // 다른 번호 선택 시 다시 showMenu() 호출
                System.out.println("잘못된 번호입니다. 다시 시도하세요.");
                showMenu();
                break;
        }
    }

    // 저장된 몬스터 확인
    public void SaveMonsters() {
        if (save.isEmpty()) { // 만약 값이 없을 경우 true 값 출력, 대결을 먼저 할 수 있도록 메소드 호출
            System.out.println("현재 저장된 몬스터가 없습니다. 먼저 몬스터와 대결해주세요..!!");
            at.attack(); // 대결상대 선택
        } else {
            // 몬스터(도감) 확인
            System.out.println("===========몬스터 도감============");
            System.out.println(save.getSave());
            System.out.println("================================");
        }
    }


}