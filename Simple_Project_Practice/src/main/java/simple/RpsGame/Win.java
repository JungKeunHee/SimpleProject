package simple.RpsGame;

import java.util.Scanner;

public class Win {

    Scanner sc = new Scanner(System.in);
    FirstMonsterInfo first = new FirstMonsterInfo();
    SecondMonsterInfo second = new SecondMonsterInfo();
    ThirdMonsterInfo third = new ThirdMonsterInfo();
    SaveMonsters save = new SaveMonsters();
    Attack at = new Attack();

    public void firstWin() {
        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(first.getName());
            System.out.println(first.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(first.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + first.getName() + "이 도망갔습니다");
        }

        showMenu();
    }

    public void secondWin() {
        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(second.getName());
            System.out.println(second.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(second.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + second.getName() + "이 도망갔습니다");
        }

        showMenu();
    }

    public void thirdWin() {

        System.out.println("[플레이어가 승리하였습니다!!]");
        System.out.print("[몬스터를 잡으시겠습니까? yes(1) or no(2) 선택] : ");
        int no = sc.nextInt();

        if (no == 1) {
            save.addMonsters(third.getName());
            System.out.println(third.getName() + " 포획완료!!!");
        } else if (no == 2) {
            System.out.println(third.getName() + "이 도망갔습니다");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.." + third.getName() + "이 도망갔습니다");
        }

        showMenu();

    }


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
                System.out.println("잘못된 번호입니다. 다시 시도하세요.");
                showMenu();
                break;
        }
    }

    public void SaveMonsters() {
        if (save.isEmpty()) {
            System.out.println("현재 저장된 몬스터가 없습니다. 먼저 몬스터와 대결해주세요..!!");
            at.attack();
        } else {
            System.out.println("===========몬스터 도감============");
            System.out.println(save.getSave());
            System.out.println("================================");
        }
    }


}