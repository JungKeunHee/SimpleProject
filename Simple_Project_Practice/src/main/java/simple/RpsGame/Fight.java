package simple.RpsGame;

import java.util.Scanner;

public class Fight {

    Win win = new Win();
    Lose lose = new Lose();

    // 첫 번째 몬스터와 대결
    public void firstMonsterFight() {
        Scanner sc = new Scanner(System.in);
        FirstMonsterInfo monster1 = new FirstMonsterInfo();

        // 플레이어 HP 설정
        int playerHP = 10;

        while (playerHP > 0 && monster1.getHp() > 0) {
            System.out.println("================야생의 " + monster1.getName() + "================");
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

            // 유효성 검사 추가(메뉴 번호 외에 다른 번호 눌렀을 시)
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
            System.out.println("============플레이어 vs " + monster1.getName() + "===============");
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
                win.firstWin(); // 플레이어 승리 시 첫 번째 몬스터 저장할 수 있는 메뉴 호출
                break;
            } else if (playerHP <= 0) {
                lose.lose();   // 몬스터 승리 시 재도전 할 수 있는 메뉴 호출
                break;
            }
        }
    }

    // 두 번째 몬스터와 대결
    public void secondMonsterFight() {
        Scanner sc = new Scanner(System.in); // Scanner를 메서드 내에서 생성
        SecondMonsterInfo monster1 = new SecondMonsterInfo();
        Win win = new Win();
        Lose lose = new Lose();

        // 플레이어 HP 설정
        int playerHP = 10;

        while (playerHP > 0 && monster1.getHp() > 0) {
            System.out.println("================야생의 " + monster1.getName() + "================");
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

            // 유효성 검사 추가(메뉴 번호 외에 다른 번호 눌렀을 시)
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
            System.out.println("============플레이어 vs " + monster1.getName() + "===============");
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
                win.secondWin(); // 플레이어 승리 시 두 번째 몬스터 저장할 수 있는 메뉴 호출
                break;
            } else if (playerHP <= 0) {
                lose.lose();    // 몬스터 승리 시 재도전 할 수 있는 메뉴 호출
                break;
            }
        }
    }

    // 세 번째 몬스터와 대결
    public void ThirdMonsterFight() {
        Scanner sc = new Scanner(System.in);
        ThirdMonsterInfo monster1 = new ThirdMonsterInfo();
        Win win = new Win();
        Lose lose = new Lose();

        // 플레이어 HP 설정
        int playerHP = 10;

        while (playerHP > 0 && monster1.getHp() > 0) {
            System.out.println("================야생의 " + monster1.getName() + "================");
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

            // 유효성 검사 추가(메뉴 번호 외에 다른 번호 눌렀을 시)
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
            System.out.println("============플레이어 vs " + monster1.getName() + "===============");
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
                win.thirdWin(); // 플레이어 승리 시 두 번째 몬스터 저장할 수 있는 메뉴 호출
                break;
            } else if (playerHP <= 0) {
                lose.lose();    // 몬스터 승리 시 재도전 할 수 있는 메뉴 호출
                break;
            }
        }
    }

}
