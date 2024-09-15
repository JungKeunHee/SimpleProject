package simple.RpsGame;

import java.util.Scanner;

public class Lose {

    // 플리어가 패배했을 경우 호출되는 메소드
    public static void lose() {
        Scanner sc = new Scanner(System.in);

        // 재도전 및 도감, 프로그램 종료 메뉴 선택
        System.out.println("[몬스터가 승리하였습니다..ㅠㅠ]");
        System.out.println("[메뉴 1번] 다시 몬스터와 대결하러 가기");
        System.out.println("[메뉴 2번] 몬스터 도감 확인하기");
        System.out.println("[메뉴 0번] 프로그램 종료");
        System.out.print("[메뉴 번호를 입력해주세요] : ");
        int no = sc.nextInt();

        // 선택한 번호에 따라 case 실행
        switch (no) {
            case 1:
                Attack at = new Attack();
                at.attack();
                break;
            case 2:
                Win win = new Win();
                win.SaveMonsters();
                break;
            case 0:
                System.out.println("프로그램을 종료합니다...");
                System.exit(0); // 프로그램 종료
            default:
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 시도하세요.");
                lose(); // 잘못된 입력 시 다시 메소드 호출
                break;
        }
    }
}