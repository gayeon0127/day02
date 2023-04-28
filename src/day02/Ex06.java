package day02;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("당신의 이름은 무엇입니까?");
	String name = scan.next();
	System.out.print("홍길동님의 국어 점수 : ");
	int korScore = scan.nextInt();
	System.out.print("홍길동님의 영어 점수 : ");
	int engScore = scan.nextInt();
	System.out.print("홍길동님의 수학 점수 : ");
	int mathScore = scan.nextInt();
	
	System.out.println("===================");
	System.out.println("이름 : " + name);
	System.out.println("===================");
	System.out.println("국어 : " + korScore);
	System.out.println("국어 : " + engScore);
	System.out.println("국어 : " + mathScore);
	System.out.println("===================");
	int sum = korScore + engScore + mathScore;
	System.out.println("합계 : " + sum);
	System.out.println("===================");
}
}


