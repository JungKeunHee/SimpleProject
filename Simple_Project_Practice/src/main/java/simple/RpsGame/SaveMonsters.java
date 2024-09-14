package simple.RpsGame;

import java.util.ArrayList;
import java.util.List;

public class SaveMonsters {

    private static List<String> save = new ArrayList<>();

    public SaveMonsters(){}

    public static List<String> getSave() {
        return save;
    }

    public void addMonsters (String value){
        save.add(value);
    }

    public boolean isEmpty (){
        return save.isEmpty();
    }

}
