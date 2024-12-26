package java_study_1226;


/*
 * 인터페이스는 '기능 선언'만 가능합니다.(구현x, for문 if문 사용x)
 * 보통 인터페이스 명명규칙 뒤에 Service를 붙임
 * 순서) 인터페이스를 가장 먼저 구현합니다.
 * 
 */
public interface LibraryService {
	void addBook(Book book); //도서 추가
	void searchBook(String keyword); //도서 검색
}
