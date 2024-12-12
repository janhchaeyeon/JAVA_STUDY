package java_study_1212;

class 학생{
	String 이름; //필드변수(전역변수), 초기화 x 생략가능!
    int 학년;
    /*
     * 클래스 구조(객체지향 프로그램(C++,Python,Java 등..)에 있는 공통 개념)
     * 1. 필드변수
     * 2. 메소드 : 메소드는 특정 작업을 수행하는 코드의 집합
     *      => 능력있는 개발자는 메소드를 여러개 만들어서 코드를 분리함.
     * 3. 생성자
     * 
     */
    
    
    /*
     *메소드의 기본 구조
     *public : 접근제어자 
     *int : 반환 데이터타입(리턴값)
     *add : 메소드 이름(보통 동사로 작성을 합니다.)
     *(int a, int b) : 인자값 or 매개변수 or 파라미터(v)
     *   파라미터 :  메소드가 작업을 수행하는데 필요한 데이터
     *return : 반환 데이터타입에 맞는 반환값(메소드의 결과를 반환)
     *
     */
    
    
    //s3.add(10, 20);
    public int add(int a, int b) {
    	return a + b;
    }

    //s3.minus(30, 20);
    public int minus(int a, int b) {
    	return a - b;
    }
    
    //퀴즈) 곱하는 메소드, 나누기 메소드를 만들어주세요.
    public int div(int a, int b) {
    	return a / b;
    	//반환 데이터타입하고 리턴타입은 동일해야 합니다.
    }
    
    
    public int mul(int a, int b) {
    	return a * b;
    }
    
    
    //반환 데이터타입(int, String, double, char, boolean..)이 String입니다.
    //반환 데이터타입에 총 9가지가 올 수 있음. + void 까지 총 10개
    public String 취미를소개하다() {
    	String 취미 = "등산";
    	return 취미; //리턴타입과 반환데이터타입은 항상 일치해야한다.
    }
    
    public void 취미를소개하다2() {
    	//void는 "리턴 없음"을 의미합니다.
    	System.out.println("취미는 운동입니다.");
    }
}


//클래스 파일 하나에 public class 한번만 작성 가능
public class 수업내용 {

	public static void main(String[] args) {
		
		
		/*
		 * Java 메모리 : Heap 이라는 영역에 저장(인스턴스 변수)
		 */
		학생 s1 = new 학생(); //new : 클래스를 불러오다 == (클래스를 인스턴스화(객체) 하다)
		s1.이름 = "홍길동"; //클래스를 new 불러오면 -> 필드변수 접근(.)이 가능하다.
		s1.학년 = 3;
		System.out.println("이름 : " + s1.이름 + ",학년 : " + s1.학년);
		System.out.println(s1); //Heap에 저장된 위치. 메모리 주소 조회 ->학생@5197848c
	
		
		//동일한 클래스 한번 더 호출하기.
		학생 s2 = new 학생();
		System.out.println(s2); // -> 학생@17f052a3
		s2.이름 = "김길동";
		s2.학년 = 1;
		System.out.println("이름 : " + s2.이름 + ",학년 : " + s2.학년);
			
		s1.학년 = 1; //홍길동 학년 수정
		System.out.println("이름 : " + s1.이름 + ",학년 : " + s1.학년);
		
		학생 s3 = new 학생();
		System.out.println(s3); //새로운 heap 영역에 저장 ->학생@2e0fa5d3
		
		int result = s3.add(10, 20);
		System.out.println("결과 : " + result);
		
		int result2 = s3.minus(30, 10);
		System.out.println("결과2 : " + result2);
		
		String 취미= s3.취미를소개하다();
		System.out.println("취미는 " + 취미);
		s3.취미를소개하다2();
	
		
		
	}
}
