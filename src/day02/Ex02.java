package day02;

public class Ex02 {

	public static void main(String[] args) {
		
		int num = 123;
		char ch = 'ㅁ';
		// 작은따옴표; 문자, 큰따옴표; 문자열
		System.out.println("변경전");
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		System.out.println("변경 후");
		num = 500;
		ch = 'b';
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		num = num + 200;
		System.out.println("num : " + num);

	}

}





