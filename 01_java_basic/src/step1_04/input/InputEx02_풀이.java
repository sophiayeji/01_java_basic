package step1_04.input;
// 23-02-13 20:50~21:00
import java.util.Scanner;

public class InputEx02_풀이 {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		 System.out.println("정수1을 입력하세요."); 
		 int number1 = scan.nextInt();
		 System.out.println("정수2를 입력하세요.");
		 int number2 = scan.nextInt();
		   
	     int sum = number1 + number2 ;
	     System.out.println("두 수의 합은" + sum + "입니다.");
		 
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.println("정수를 입력하세요.");
		int number = scan.nextInt();
		System.out.println(number % 2 !=0 ? true:false);
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적을 입력하세요.");
		int score = scan.nextInt();
		System.out.println(score >=60 && score <=100 ? true:false);
		
	
	}	
}
