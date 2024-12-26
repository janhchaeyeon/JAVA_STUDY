package java_study_1226;

class Book_ {
	String title;
	int price = 1000;

	public Book_(String title, int price) {// 파라미터에 있는 title과 price도 지역변수
		this.title = title;
		this.price = price;

	}

	public void showBook() { // 메소드
		String author = "작자미상"; // 지역변수 - showBook 메소드 안에서만 사용가능
		System.out.println("title : " + title); // 메소드 안에서 전역변수 접근 가능
		System.out.println("price : " + price);

	}

	public void showAuthor() {
		String author = "작자미상";
		int price = 100;
		System.out.println("author : " + author);// 에러.. 똑같이 변수 만들어주면 사용 가능
		System.out.println("title : " + title); // 전역변수는 어디든 사용 가능(단, 클래스안에서)
		System.out.println("price : " + price);
		System.out.println("price : " + this.price); // 전역변수(필드변수) price -> this 붙여줌
	}

}

public class 복습 {

	public static void main(String[] args) {
		/*
		 * Book b = new Book(); b.showAuthor();
		 */

		// 자바는 클래스(객체)도 '데이터 타입'이다.

		Book_[] bookList = new Book_[2]; // Book 타입을 저장하는 배열 - Book도 데이터 타입이다.

		Book_ book1 = new Book_("자바의 정석", 2000);
		bookList[0] = book1; // 0번 인덱스에 book1 대입
		bookList[1] = new Book_("파이썬의 정석", 1000);

		int priceSum = 0; // 총합 구하는 변수
		for (Book_ b : bookList) {// 첫번째. 향상된 for문. 배열 크기만큼 반복
			b.showBook();
			// 1.퀴즈 책 제목이 '자바의 정석'인 책의 정보(showBook)를 출력하기
			// 2.bookList에 저장된 책의 총 price는 얼마인지 구하기
		}

		for (int i = 0; i < 2; i++) {// 두번째 방법. 일반 for문. 조건식 만큼 반복(i<2라고 조건 제시)
			bookList[i].showBook();
		}

		for (int i = 0; i < 2; i++) {
			// 내코드 if(bookList[i].showBook().equals("자바의 정석"));{
			// bookList[i].showBook();
			if (bookList[i].title.equals("자바의 정석")) {
				bookList[i].showBook();
			}
			if ("자바의 정석".equals(bookList[i].title)) {
				bookList[i].showBook();
			}
			priceSum += bookList[i].price;
		}
		System.out.println("총합 : " + priceSum);

	}

}
