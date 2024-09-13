package simple.memberSignProgram;

import java.time.LocalDateTime;

public class MemberDTO {

    private int no;
    private String name;
    private String id;
    private String pwd;

    public MemberDTO() {
    }

    public MemberDTO(int no, String name, String id, String pwd) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
