package simple.lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {

        /* title. 간단한 로또 프로그램 */

        Scanner sc = new Scanner(System.in);
        AutoLottoNumber autoLottoNum = new AutoLottoNumber();
        ManualLottoNumber manualLottoNum = new ManualLottoNumber();

        while (true) {
            System.out.println("============로또 구매 및 당첨 확인============");
            System.out.println("[메뉴 1번] 자동으로 구매하기");
            System.out.println("[메뉴 2번] 수동으로 구매하기");
            System.out.println("[메뉴 3번] 이 번주 당첨번호 및 당첨내역 확인");
            System.out.println("[메뉴 0번] 프로그램 종료하기");
            System.out.println("===========================================");
            System.out.print("원하시는 메뉴번호를 입력해주세요 : ");
            int selectNum = sc.nextInt();

            switch (selectNum){
                case 1:
                    autoLottoNum.setAutoLottoNum();
                    break;
                case 2:
                    manualLottoNum.setManualLottoNum();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                    break;
            }
        }

    }
}
