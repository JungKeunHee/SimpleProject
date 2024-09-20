package simple.lotto;

import java.util.TreeSet;

public class WinningLottoNumber {

    public void winningLottoNum (){

        TreeSet<Integer> winningLottoNumber = new TreeSet<>();
        AutoLottoNumber autoLottoNum = new AutoLottoNumber();

        while (winningLottoNumber.size() < 6){

            winningLottoNumber.add((int)(Math.random() * 45) + 1);

        }
        System.out.println("★★★★★★이 번주 당첨번호★★★★★★");
        System.out.println(winningLottoNumber);
        System.out.println("★★★★★★★★★★★★★★★★★★★★★");


    }

}
