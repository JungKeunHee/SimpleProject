package simple.RpsGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstMonsterFight {

    List<Integer> minusHP = new ArrayList<>();
    Win win = new Win();
    Lose lose = new Lose();

    public void firstMonsterFight() {
        Scanner sc = new Scanner(System.in); // Scanner를 메서드 내에서 생성
        FirstMonsterInfo monster1 = new FirstMonsterInfo();
        int playerHP = 10;

        while (playerHP > 0 && monster1.getHp() > 0) {
            System.out.println("===============야생의 " + monster1.getName() + "===============");
            System.out.println(monster1.getName() + " 가위바위보 대결 ");
            System.out.println("===========================================");

            System.out.println("=========플레이어 및 몬스터의 HP 정보==========");
            System.out.println("현재 " + monster1.getName() + " HP : " + monster1.getHp());
            System.out.println("현재 플레이어 HP : " + playerHP);
            System.out.println("===========================================");

            System.out.println("=============플레이어 공격 선택===============");
            System.out.println("★선택한 숫자만큼 데미지가 들어갑니다★");
            System.out.print("가위(1), 바위(2), 보(3) 중 한 가지 (숫자)선택 : ");
            int playerAttack = sc.nextInt();

            // 유효성 검사 추가
            if (playerAttack < 1 || playerAttack > 3) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                continue; // 잘못된 입력 시 다음 루프로 넘어감
            }

            System.out.println("플레이어 공격 : " + (playerAttack == 1 ? "가위(1)" : playerAttack == 2 ? "바위(2)" : "보(3)"));
            System.out.println("===========================================");

            // 몬스터의 랜덤 공격
            int monsterRandomAttackDamage = (int) (Math.random() * 3) + 1;
            System.out.println("==============몬스터 공격 정보================");
            System.out.println(monster1.getName() + " 공격 : " + (monsterRandomAttackDamage == 1 ? "가위(1)" : monsterRandomAttackDamage == 2 ? "바위(2)" : "보(3)"));
            System.out.println("===========================================");

            // 승패 결정
            System.out.println("=============플레이어 vs " + monster1.getName() + "===============");
            if (playerAttack == monsterRandomAttackDamage) {
                System.out.println("비겼습니다...");
            } else if (playerAttack == 1 && monsterRandomAttackDamage == 2) {
                System.out.println("플레이어 : 가위(1) vs 몬스터 : 바위(2)");
                System.out.println("몬스터가 이겼습니다..ㅠㅠ");
                playerHP -= 2;
            } else if (playerAttack == 1 && monsterRandomAttackDamage == 3) {
                System.out.println("플레이어 : 가위(1) vs 몬스터 : 보(3)");
                System.out.println("플레이어가 이겼습니다!!!!");
                monster1.setHp(monster1.getHp() - 1);
            } else if (playerAttack == 2 && monsterRandomAttackDamage == 1) {
                System.out.println("플레이어 : 바위(2) vs 몬스터 : 가위(1)");
                System.out.println("플레이어가 이겼습니다!!!!");
                monster1.setHp(monster1.getHp() - 2);
            } else if (playerAttack == 2 && monsterRandomAttackDamage == 3) {
                System.out.println("플레이어 : 바위(2) vs 몬스터 : 보(3)");
                System.out.println("몬스터가 이겼습니다..ㅠㅠ");
                playerHP -= 3;
            } else if (playerAttack == 3 && monsterRandomAttackDamage == 1) {
                System.out.println("플레이어 : 보(3) vs 몬스터 : 가위(1)");
                System.out.println("몬스터가 이겼습니다..ㅠㅠ");
                playerHP -= 1;
            } else if (playerAttack == 3 && monsterRandomAttackDamage == 2) {
                System.out.println("플레이어 : 보(3) vs 몬스터 : 바위(2)");
                System.out.println("플레이어가 이겼습니다!!!!");
                monster1.setHp(monster1.getHp() - 3);
            }

            System.out.println("===========================================");

            // 게임 종료 조건 체크
            if (monster1.getHp() <= 0) {
                win.firstWin();
                break;
            } else if (playerHP <= 0) {
                lose.lose();
                break;
            }
        }
    }
}