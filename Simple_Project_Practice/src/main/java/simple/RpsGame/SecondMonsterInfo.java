package simple.RpsGame;

public class SecondMonsterInfo {

    private String name;
    private int hp;

    public SecondMonsterInfo() {
        this.name = "잠만보"; // 기본값
        this.hp = 10; // 기본 HP
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0); // HP는 0 이상으로 설정
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SecondMonsterInfo{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}