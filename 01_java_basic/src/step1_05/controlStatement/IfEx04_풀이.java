package step1_05.controlStatement;
// 2023-02-13 21:34~21:43 
import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
   
		System.out.println("ID를 입력하세요");
		int myId = scan.nextInt();

		System.out.println("PW를 입력하세요");
		int myPw = scan.nextInt();
		
		if(myId == 1234) System.out.println("로그인 성공");
		if(myId != 1234) System.out.println("로그인 실패");
		if(myPw == 1111) System.out.println("로그인 성공");
		if(myPw != 1111) System.out.println("로그인 실패");
		
	}

}
