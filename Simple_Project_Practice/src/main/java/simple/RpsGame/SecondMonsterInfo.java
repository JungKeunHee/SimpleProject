package simple.RpsGame;

public class SecondMonsterInfo {

    private String name;
    private int hp;

    public SecondMonsterInfo() {
        this.name = "잠만보"; // 두 번째 몬스터 이름 설정
        this.hp = 10; // 기본 HP
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public String getName() {
        return name;
    }

}