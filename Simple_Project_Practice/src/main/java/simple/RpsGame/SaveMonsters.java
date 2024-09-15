package simple.RpsGame;

import java.util.ArrayList;
import java.util.List;

// 몬스터 저장(도감)
public class SaveMonsters {

    // static을 사용하여 하나의 인스턴스로 저장할 수 있게끔 설계
    // List<String> 을 사용하여 선택한 몬스터 누적으로 저장
    private static List<String> save = new ArrayList<>();

    public SaveMonsters(){

    }

    public static List<String> getSave() {
        return save;
    }

    // 몬스터를 저장하고 싶다면 해당 몬스터 name 을 save 변수에 저장
    public void addMonsters (String value){
        save.add(value);
    }

    // isEmptu 사용하여 현재 save 변수에
    // 값이 없다면 true 있다면 false로 확인하여 값 여부 판단 설계
    // 값이 있다면 save에 저장된 몬스터들 호출
    public boolean isEmpty (){
        return save.isEmpty();
    }

}
