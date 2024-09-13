package simple.RpsGame;

public class Monstet1 {

    private String name = "고라파덕";
    private int hp = 10;

    public Monstet1() {
    }

    public Monstet1(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "[몬스터 이름='" + name + '\'' +
                ", 체력=" + hp +
                ']';
    }
}
