package simple.lotto;

import java.util.TreeSet;

public class AutoLottoNumber {

    public void setAutoLottoNum(){

        TreeSet<Integer> autoLottoNum = new TreeSet<>();

        while(autoLottoNum.size() < 6) {
            autoLottoNum.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("▩▩▩▩▩▩▩자동으로 구매한 로또번호▩▩▩▩▩▩▩");
        System.out.println(autoLottoNum);
        System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");

    }
}
