package simple.RpsGame;

import java.util.Scanner;

public class Attack {

    // 대결 상대 선택할 수 있는 메소드
    public void attack() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============사냥할 몬스터 선택==============");
        System.out.println("[1번] 고라파덕     [2번] 잠만보     [3번] 피카츄");
        System.out.println("===========================================");
        System.out.print("사냥할 몬스터 번호를 입력하세요 : ");
        int no = sc.nextInt();

        Fight fight = new Fight();

        // 선택한 번호에 따라 대결상대와 대결할 수 있도록 설계
        switch (no) {
            case 1:
                fight.firstMonsterFight(); // 첫 번째 몬스터와 대결
                break;
            case 2:
                fight.secondMonsterFight(); // 두 번째 몬스터와 대결
                break;
            case 3:
                fight.ThirdMonsterFight(); // 세 번째 몬스터와 대결
                break;
            default:
                // 다른 번호 입력 시 다시 선택할 수 있도록 구문 출력
                System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                break;
        }

    }
}