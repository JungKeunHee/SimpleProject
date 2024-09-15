package simple.RpsGame;

// 첫 번재 몬스터 정보
public class FirstMonsterInfo {

    private String name;
    private int hp;
    
    public FirstMonsterInfo() {
        this.name = "고라파덕"; // 첫 번재 몬스터 이름 설정
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