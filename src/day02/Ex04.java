package day02;

public class Ex04 {
	public static void main(String[] args) {
		// 상수 : 값이 한 번 지정되면 변경이 불가능한 변수
		// 국가, 파이 같은 값 표현 시 사용
		
		final int num = 100;
		//num = 200; - 변경 안됨
		System.out.println(num);
		
		String name = "홍길동";
		System.out.println(name);
		
		final String KOREA = "대한민국";
		// 보편적으로 상수화 시키는 값은 대문자로 표기
		System.out.println(KOREA);
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		String addr;
		addr = "산골짜기";
		System.out.println(addr);
		
		int n1,n2,sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println(sum);
		
		int num1 = 0,num2 = 0,sum2 = 0;
		sum2 = num1 + num2;
		System.out.println(sum2);
		// 값이 입력되기 전이기 때문에 오류 발생 
		// => 초기화 진행 
		
		String a = null;
		System.out.println(a);
		// 첫번째 문자가 대문자인 경우, null로 초기환
		
	}
}



