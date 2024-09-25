package simple.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    BookManager bookManager = new BookManager();
    Scanner sc = new Scanner(System.in);


    public BookMenu() {

    }

    public void mainMenu(){


        while(true) {
            System.out.println("★★★★★★★★★★도서관리 프로그램 메인메뉴★★★★★★★★★★");
            System.out.println("[매뉴 1번] : 도서 추가");
            System.out.println("[메뉴 2번] : 보관된 책 중 선택하여 삭제");
            System.out.println("[메뉴 3번] : 찾을 도서 제목");
            System.out.println("[메뉴 4번] : 저장된 책 목록");
            System.out.println("[메뉴 5번] : 책 정렬(오름차순, 내림차순 선택)");
            System.out.println("[메뉴 0번] : 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int selectNo = sc.nextInt();

            switch (selectNo){
                case 1:
                   BookDTO bookDTOAdd = inputBook();
                   bookManager.addBook(bookDTOAdd);
                   break;

                case 2:
                    int deleteBookNo = inputBookNo();
                    bookManager.deleteBook(deleteBookNo);
                    break;
                case 3:
                    sc.nextLine();
                    String btitle = inputBookTitle();
                    bookManager.searchBook(btitle);
                    break;

                case 4:
                    bookManager.displayAll();
                    break;
                case 5:
                    int sortedBookList = selectSortedBook();
                    bookManager.sortedBookList(sortedBookList);
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    System.exit(0);
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                    break;
            }
        }
    }

    public BookDTO inputBook(){

        BookDTO bookDTO = new BookDTO();

        System.out.print("도서 번호 입력 : ");
        int bookNo = sc.nextInt();

        System.out.print("장르 분류 번호[1. 인문, 2. 자연과학, 3. 의료, 4. 기타] : ");
        int category = sc.nextInt();

        sc.nextLine();
        System.out.print("도서 제목 입력 : ");
        String title = sc.nextLine();

        System.out.print("도서 저자 입력 : ");
        String author = sc.nextLine();

        bookDTO.setbNo(bookNo);
        bookDTO.setCategory(category);
        bookDTO.setTitle(title);
        bookDTO.setAuthor(author);

        return bookDTO;
    }

    public int inputBookNo () {

        System.out.println("===============[현재 저장된 도서목록===============");
        bookManager.displayAll();
        System.out.println("================================================");

        System.out.println();

        System.out.print("삭제할 도서 번호 입력 : ");
        int bookNo = sc.nextInt();

        return bookNo;
    }

    public String inputBookTitle () {

        System.out.print("검색할 도서 제목 입력 : ");
        String btitle = sc.nextLine();

        return btitle;
    }

    public int selectSortedBook (){

        System.out.println("[메뉴 1번] : 오름차순 정렬");
        System.out.println("[메뉴 2번] : 내림차순 정렬");
        System.out.print("메뉴 번호를 입력해주세요 : ");
        int selectNo = sc.nextInt();

        return selectNo;

    }

}
