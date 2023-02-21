package step1_05.controlStatement;

public class ifEx08 {

	public static void main(String[] args) {
		/*
		 * 
		 * # 중첩 if 문
		 * 
		 * 	- if문 안의 명령어에 if문이 중첩으로 들어간 형태
		 * 
		 * */

		int grade = 100;
		
		if(grade >=60) {
			if(grade ==100) {
				System.out.println("만점");
			}
			System.out.println("합격");				
			}
		if(grade <60) {
			System.out.println("불합격");
		}
		}
		
	}


