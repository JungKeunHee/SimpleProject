package simple.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookManager  {

    // 입력한 도서 정보 ArrayList 로 저장
    public static List<BookDTO> bookDTOList = new ArrayList<>();


    // 기본 생성자
    public BookManager() {

    }

    // 도서 목록 추가
    public void addBook(BookDTO bookDTO) {

        bookDTOList.add(bookDTO);

        System.out.println("도서 제목 : " + bookDTO.getTitle());
        System.out.println("도서 목록에 추가(저장) 되었습니다...");

    }

    // 도서 삭제
    public void deleteBook(int deleteBookNo) {

        BookMenu bookMenu = new BookMenu();

        //BooDTO 클래스(자료형)에 변수선언 후 빈공간 할당(초기화)
        BookDTO bookToDelete = null;

        for (BookDTO bookDTO : bookDTOList){
            if(bookDTO.getbNo() == deleteBookNo){
                bookToDelete = bookDTO;
                break;
            }
        }

        if (bookToDelete != null){
            bookDTOList.remove(bookToDelete);

            System.out.println("요청하신 도서번호가 확인되었습니다...");
            System.out.println("해당 도서 목록을 삭제합니다...\n");

            System.out.println("=============삭제 후 도서 목록============");
            displayAll();
            System.out.println("=======================================");

        } else {

            System.out.println("요청하신 도서 번호가 확인되지 않습니다...");
            System.out.println("도서 번호를 다시 확인해주세요... 메인메뉴로 돌아갑니다...\n");
        }

        bookMenu.mainMenu();

    }

    public void searchBook(String btitle) {

        int indexNo = -1; // 기본값 -1로 설정

        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookDTOList.get(i).getTitle().equals(btitle)) {
                indexNo = i; // 제목이 일치하는 경우 인덱스 저장
                break; // 일치하는 경우 루프 종료
            }
        }

        System.out.println("요청하신 제목을 가진 책이 " + indexNo + " 번호에 저장되어 있습니다");
        System.out.println(bookDTOList.get(indexNo));
    }

    public void displayAll() {

        if (bookDTOList.isEmpty()) {
            System.out.println("현재 저장된 도서목록이 없습니다");
            System.out.println("먼저 도서를 추가해주세요. 메인메뉴로 돌아갑니다...");

        } else {

            for (BookDTO books : bookDTOList) {
                System.out.println(books);
            }

        }

    }

    public void sortedBookList(int sortedBookDTOList) {

            System.out.println("============[정렬 전] 도서 목록============");
            displayAll();

            printBookList(sortedBookDTOList);

        }


    public void printBookList(int selectNo){
        BookMenu bookMenu = new BookMenu();

        if (selectNo == 1){
            Collections.sort(bookDTOList, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
            System.out.println("================[도서 제목 기준 오름차순 정렬]================");
                for (BookDTO bookList : bookDTOList){
                    System.out.println(bookList);
                }
        } else if (selectNo == 2){
            Collections.sort(bookDTOList, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    return o2.getTitle().compareTo(o1.getTitle());
                }
            });
            System.out.println("================[도서 제목 기준 내림차순 정렬]================");
            for (BookDTO bookList : bookDTOList){
                System.out.println(bookList);
            }
        }

        bookMenu.mainMenu();
    }
}


