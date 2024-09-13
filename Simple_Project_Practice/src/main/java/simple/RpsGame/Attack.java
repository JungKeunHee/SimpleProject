package simple.RpsGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attack {

    Scanner sc = new Scanner(System.in);
    List<Integer> minusHP = new ArrayList<>();

    public void attack() {
        Monstet1 monster1 = new Monstet1();
        int playerHP = 10;

        while (playerHP > 0 && monster1.getHp() > 0) {
            System.out.println("============야생의 " + monster1.getName() + "=============");
            System.out.println(monster1.getName() + " 가위바위보 대결 ");
            System.out.println("=====================================");

            System.out.println();

            System.out.println("=======플레이어 및 몬스터의 HP 정보=======");
            System.out.println("현재 " + monster1.getName() + " HP : " + monster1.getHp());
            System.out.println("현재 플레이어 HP : " + playerHP);
            System.out.println("======================================");

            System.out.println();

            System.out.println("===========플레이어 공격 선택============");
            System.out.println("★선택한 숫자만큼 데미지가 들어갑니다★");
            System.out.print("가위(1), 바위(2), 보(3) 중 한 가지 (숫자)선택 : ");
            int playerAttack = sc.nextInt();

            System.out.println();

            System.out.println("플레이어 공격 : " + (playerAttack == 1 ? "가위(1)" : playerAttack == 2 ? "바위(2)" : "보(3)"));
            System.out.println("======================================");

            System.out.println();

            System.out.println("============몬스터 공격 정보=============");
            int monsterRandomAttackDamage = (int) (Math.random() * 3) + 1;
            System.out.println(monster1.getName() + " 공격 : " + (monsterRandomAttackDamage == 1 ? "가위(1)" : monsterRandomAttackDamage == 2 ? "바위(2)" : "보(3)"));
            System.out.println("======================================");

            System.out.println();

            System.out.println("==========플레이어 vs " + monster1.getName() + "===========");
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

            System.out.println("======================================");

            // 몬스터 HP 기록
            minusHP.add(monster1.getHp());


            System.out.println();


            // 게임 종료 조건 체크
            if (monster1.getHp() <= 0) {
                System.out.println("몬스터를 처치했습니다!!!");
                break;
            } else if (playerHP <= 0) {
                System.out.println("플레이어가 패배했습니다..다시 대결하고 싶다면 1번, 프로그램을 조욜하고 싶다면 2번 : ");
                break;
            }

        }
    }

    public void retryOrExit(){



    }
}