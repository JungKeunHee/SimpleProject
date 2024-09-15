package simple.RpsGame;

public class ThirdMonsterInfo {

    private String name;
    private int hp;

    public ThirdMonsterInfo() {
        this.name = "피카츄"; // 세 번째 몬스터 이름 설정
        this.hp = 10; // 기본 HP
    }

    public String getName() {

        return name;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }
}
