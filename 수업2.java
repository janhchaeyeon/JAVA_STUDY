package java_study_1231;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

class Emp{//Emp(사원) 클래스 생성
	String ename; //사원 이름
	int sal; //급여
	String dname; //부서
	String job; //담당업무
	
	Emp(String ename, int sal, String dname, String job){
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		this.job = job;
		
	}
	
}

public class 수업2 {

	public static void main(String[] args) {
		/*
		 * ***ArrayList : 동적 크기 조절이 가능한 자료구조(배열)
		 * HashSet : 중복 허용하지 않는 고유한 값만 저장되는 자료구조(배열)
		 * ***HashMap : key와 value의 쌍으로 데이터를 저장하는 자료구조(배열)
		 */
		
		ArrayList<Emp> emp = new ArrayList<Emp>(); //객체배열 같은 개념
		
		
		//데이터 추가(사원 추가)
		emp.add(new Emp("KING", 5000, "PRESIDENT","ACCCOUNTING"));
		emp.add(new Emp("JONSE", 2975, "SALESMAN", "SALES"));
		emp.add(new Emp("ALLEN", 1250, "SALESMAN", "SALES"));
		emp.add(new Emp("TURNER", 1500, "SALESMAN", "SALES"));
		
		//1번째 저장된 사원 조회
		Emp e1 = emp.get(1);
		System.out.println("사원이름 : " + e1.ename);
		System.out.println("사원급여 : " + e1.sal);
		
		//모든 사원의 급여 총합과 급여 평균을 조회
		int salSum = 0; //급여 총합
		int salAvg = 0; //급여 평균
		for(Emp e : emp) {
			salSum += e.sal; //list에 저장된 각 사원 sal 합산하기
		}
		System.out.println("사원 총급여 : " + salSum);
		salAvg = salSum / emp.size();
		System.out.println("사원 총급여 평균 : " + salAvg);
		
		//퀴즈 : 'SALES'가 담당업무인 사원 수 구하기
		int count = 0; //사원 수 구하는 변수
		for(Emp e : emp) {
			if(e.job.equals("SALES")) {
				++count;
			}
			
			
		}
		
		System.out.println("SALES 수 : " + count);
		
		//퀴즈 : 사원이름이 ALLEN, TURNER의 급여와 부서 조회
		//내 코드 for(Emp e : emp) {
			//if(e.ename.equals("ALLEN")) {
				//System.out.println(e.sal + e.dname);
		
		for(Emp e : emp) {
			if(e.ename.equals("ALLEN") || e.ename.equals("TRUNER")) {
				System.out.println("사원 급여 : " + e.sal);
				System.out.println("해당 사원 부서 : " + e.dname);
			
			}
		}
		
		
		
	}

}
