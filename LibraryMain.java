package java_study_1226;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		LibraryService library = new LibraryServiceImpl(10); //인터페이스 타입으로 선언
		
		while(true) {//무한 반복
			System.out.println("★★★★★ 도서관리 프로그램 ★★★★★");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("[1] 도서추가 [2] 도서검색 [3] 시스템 종료");
			System.out.print("번호입력 : "); //마지막 ln 아님주의
			int choice = scan.nextInt(); //번호 입력받기
			scan.nextLine(); //버퍼지우기
			
			if(choice == 1) {//도서 추가
				System.out.print("제목 입력 : ");
				String title = scan.nextLine();
				System.out.print("저자 : ");
				String author = scan.nextLine();
				System.out.print("ISBN : "); //고유번호
				String isbn = scan.nextLine();
				library.addBook(new Book(title, author, isbn)); //도서 추가 로직
			
			}else if (choice == 2) {//도서 검색
				System.out.println("검색어  : "); //제목 or 저자 or 고유번호 택 1 검색
				String keyword = scan.nextLine();
				library.searchBook(keyword);
						
				
			}else if (choice == 3) {//시스템 종료
				System.out.println("시스템을 종료합니다.");
				scan.close();//스캐너 종료
				System.exit(10);//콘솔 강제종료
			}else {
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
				
			}
 		}
		
	}

}
