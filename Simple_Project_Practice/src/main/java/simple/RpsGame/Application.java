package simple.RpsGame;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. 몬스터 가위바위보 게임 */
        /* comment. 가위바위보를 통해 승리하면 몬스터에게 데미지를 줘서 승리하는 게임 */

        Scanner sc = new Scanner(System.in);
        Attack at = new Attack();
        Win win = new Win();

        System.out.println("==========몬스터 가위바위보 게임==========");

        // while(true) 를 통해 무한루프 설정
        while (true) {
            System.out.println("[메뉴 1번] : 사냥하러 가기");
            System.out.println("[메뉴 2번] : 현재까지 잡은 몬스터 목록(도감)");
            System.out.println("[메뉴 0번] : 프로그램 종료");
            System.out.print("[메뉴 번호를 선택해주세요] : ");
            int no = sc.nextInt();; // 메뉴 번호를 매 루프마다 입력받기

            // switch 문을 사용하여 사용자가 입력받은 정수값 기준으로 case 실행
            switch (no) {
                case 1:
                    // 대결상대 선택
                    at.attack();
                    break;
                case 2:
                    // 몬스터 도감 확인
                    win.SaveMonsters();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 메뉴에 맞는 번호를 입력해주세요...");
                    break; // 잘못된 번호 입력 시 메뉴에 맞는 번호 선택할 수 있도록 메세지 호출
            }
        }
    }
}