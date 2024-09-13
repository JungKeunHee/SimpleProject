package simple.RpsGame;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. 몬스터 가위바위보 게임 */
        /* comment. 가위바위보를 통해 승리하면 몬스터에게 데미지를 줘서 승리하는 게임 */

        // 사용자에게 가위바위보 입력받아야 하므로 Scanner 사용
        Scanner sc = new Scanner(System.in);
        Attack at = new Attack();

            System.out.println("============몬스터 가위바위보 게임============");
            System.out.println("1번 사냥하러 가기");
            System.out.println("2번 현재까지 잡은 몬스터 목록(도감)");
            System.out.println("0번 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

        // while(true) 를 통해 무한루프 설정
        while (true) {

            // switch 문을 사용하여 사용자가 입력받은 정수값 기준으로 case 실행
            switch (no){
                case 1:
                    at.attack();
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다 메뉴에 맞는 번호를 입력해주세요...");
                    return;
            }
        }

    }

}
