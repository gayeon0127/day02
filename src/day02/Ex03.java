package day02;

public class Ex03 {

	public static void main(String[] args) {
		/*
		자료형 변환
		; 특정 자료형을 다른 자료형으로 변환하는 것
		*/
		
		char ch = 'a';
		int num = 65;
		System.out.println(ch);
		System.out.println(num);
		
		// char ch02 = num;
		// 2byte < 4byte로 오류발생
		char ch02 = (char)num;
		// 강제형 변환0
		
		int num02 = ch;
		// 자동형 변환
		// 4byte > 2byte로 입력 가능 
		// 단, 문자를 숫자로 인식 - 아스키코드
		
		System.out.println(ch02);
		System.out.println(num02);
		
	
	}

}





