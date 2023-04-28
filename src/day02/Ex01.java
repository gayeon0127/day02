package day02;

public class Ex01 {

	public static void main(String[] args) {
		/*
		변수 ; 데이터를 저장하는 공간 
		자료형 ; 데이터에 따라 사용하는 값
		- int(4byte); 정수 
		- float(4byte) double(8byte) : 실수표현 - 최근 double 주로 사용
		- char(2byte) : 문자 표현
		- boolean(1byte) : T/F 
		
		변수 생성
		- 자료형 변수명; or 자료형 변수명 = 값;
		- 1number (x) n22u111m33(O)
		- changenum => changeNum 
		- 예약어 사용 불가 예)system, out 등
		*/
		
		int age = 50;
		float height = 150.0f;
		// 해당하는 실수 값을 f(loat)으로 사용하겠다는 의미
		double weight = 20.0;
		
		System.out.println("나의 나이는 " + age + "살 입니다.");
		/*하드코딩 ; 직접적인 값의 입력은 추후 수정시 불편
		 => 변수를 이용한 코딩이 이상적
		 */
		System.out.println("나의 키는 " + height + "입니다.");
		System.out.println("나의 몸무게는 " + weight + "입니다.");
	}
}




