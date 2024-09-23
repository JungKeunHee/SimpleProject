package simple.book;

public class BookDTO {

    private int bNo;        // 도서 번호
    private int category;   // 장르 분류 번호
    private String title;   // 도서 제목
    private String author;  // 도서 저자

    public BookDTO() {
    }

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "도서 번호 : " + bNo +
                ", 카테고리[1. 인문, 2. 자연과학, 3. 의료, 4. 기타] : " + category +
                ", 도서 제목 : " + title + '\'' +
                ", 도서 저자 : " + author + '\'' +
                '}';
    }
}
