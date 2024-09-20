package simple.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ManualLottoNumber {

    public void setManualLottoNum(){

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> manualLottoNum = new TreeSet<>();
        AutoLottoNumber autoNum = new AutoLottoNumber();

        while(manualLottoNum.size() < 6){

            System.out.print("[1 ~ 45번] 1 번 째 번호를 입력 : ");
            int one = sc.nextInt();
            manualLottoNum.add(one);

            System.out.print("[1 ~ 45번] 2 번 째 번호를 입력 : ");
            int two = sc.nextInt();
            manualLottoNum.add(two);

            System.out.print("[1 ~ 45번] 3 번 째 번호를 입력 : ");
            int three = sc.nextInt();
            manualLottoNum.add(three);

            System.out.print("[1 ~ 45번] 4 번 째 번호를 입력 : ");
            int four = sc.nextInt();
            manualLottoNum.add(four);

            System.out.print("[1 ~ 45번] 5 번 째 번호를 입력 : ");
            int five = sc.nextInt();
            manualLottoNum.add(five);

            System.out.print("[1 ~ 45번] 6 번 째 번호를 입력 : ");
            int six = sc.nextInt();
            manualLottoNum.add(six);

        }
        System.out.println("▩▩▩▩▩▩▩수동으로 구매한 로또번호▩▩▩▩▩▩▩");
        System.out.println(manualLottoNum);
        System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");

        ArrayList<AutoLottoNumber> autoNumList = new ArrayList<>();

    }

}
