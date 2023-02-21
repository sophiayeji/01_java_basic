package step1_05.controlStatement;

public class IfEx01 {

	public static void main(String[] args) {
		
		if (true) { // if문에 속한 명령어는 tab으로 들여쓰기 한다. 
			
			System.out.println("명령어1");
			System.out.println("명령어2");
			System.out.println("명령어3");
		}
		
		if(false) {
			System.out.println("명령어4");
			System.out.println("명령어5");
			System.out.println("명령어6");
		}

		System.out.println();
		
		
		// 제어문 > 분기문 
		// if문에 속한 명령어 1줄이면 {}룰 생략할 수 있다. 
		int number = 10;
		if (number % 2 == 0) System.out.println("짝수");
		if (number % 2 == 1) System.out.println("홀수");
		}
	/*
	 * 
	 *  # 조건문 if 
	 * 
	 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
	 *  
	 *  [ 형식 ]
	 *  
	 *  if (조건식) {
	 *  
	 *  	조건식이 true일때 실행할 명령어;
	 *  
	 *  }
	 * 
	 * 
	 * */
}

