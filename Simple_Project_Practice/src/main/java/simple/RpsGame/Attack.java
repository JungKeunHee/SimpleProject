package simple.RpsGame;

import java.util.Scanner;

public class Attack {

    public void attack() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============사냥할 몬스터 선택==============");
        System.out.println("[1번] 고라파덕     [2번] 잠만보     [3번] 피카츄");
        System.out.println("===========================================");
        System.out.print("사냥할 몬스터 번호를 입력하세요 : ");
        int no = sc.nextInt();

        FirstMonsterFight first = new FirstMonsterFight();
        SecondMonsterFight second = new SecondMonsterFight();
        ThirdMonsterFight third = new ThirdMonsterFight();

        switch (no) {
            case 1:
                first.firstMonsterFight();
                break;
            case 2:
                second.secondMonsterFight();
                break;
            case 3:
                third.ThirdMonsterFight();
                break;
            default:
                System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                break;
        }

    }
}