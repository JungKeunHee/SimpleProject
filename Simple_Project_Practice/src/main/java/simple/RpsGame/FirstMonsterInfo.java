package simple.RpsGame;

public class FirstMonsterInfo {

    private String name;
    private int hp;

    public FirstMonsterInfo() {
        this.name = "고라파덕"; // 기본값
        this.hp = 10; // 기본 HP
    }

    public FirstMonsterInfo(String name, int hp) {
        this.name = name;
        this.hp = Math.max(hp, 0); // HP는 0 이상
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0); // HP는 0 이상
    }

    @Override
    public String toString() {
        return "[몬스터 이름='" + name + '\'' +
                ", 체력=" + hp +
                ']';
    }
}