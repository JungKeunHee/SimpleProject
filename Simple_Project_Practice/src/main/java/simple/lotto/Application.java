package simple.lotto;

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {

        /* title. 간단한 로또 프로그램 */

        // 중복을 허용하지 않는 제네릭 컬렉션 HashSet
        HashSet<Integer> lotto = new HashSet<>();

        // 범위만큼 사이즈를 설정
        while(lotto.size() < 6){

            // Math.random 을 이용해서 난수 출력, Math는 실수이기 때문에 정수로 출력해야 하므로 (int) 자료형태 변환
            // 정수형으로 변환된 난수를 randomNum 변수에 저장
            int randomNum = (int)(Math.random() * 45) + 1;

            // lotto.add(난수 저장된 변수명)을 사용하여 사이즈 만큼 저장
            lotto.add(randomNum);
        }

        // 저장된 난수 출력
        System.out.println(lotto);

    }
}
