package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {
		// 다양한 데이터 출력
		
				// 1-1) 정수   : 소수점이 없는 수
		        System.out.println(12);
				// 1-2) 실수   : 소수점이 있는 수
				System.out.println(3.14);		         
				// 1-3) 문자   : 단일문자 ( 홑따옴표 , 싱글쿼테이션 , 싱글쿼터 )
				System.out.println('A');
				// 1-4) 문자열 : 글자 ( 쌍따옴표 , 더블쿼테이션 , 더블쿼터 )
				System.out.println("ABC");
				// 1-5) 불리언 : 참과거짓
				System.out.println(true); // "true" x
				System.out.println(false); // "false" x 
				System.out.println();
				
				// 2. 복수의 데이터 출력 ( , 가 아닌 + 를 사용해야 된다. )
				
				//System.out.println(1,3,5); (x)
				  System.out.println(1 + 3 + 5); // 단순더하기
				  System.out.println(1 + "" + 3 + "" +5); // 이어붙이기
				  System.out.println(1 + "," + 3 + "," +5); // 이어붙이기 
				  		
				// 2-1) 문자열 + 문자열 = 문자열
				 System.out.println("수강과목: " + "백앤드 웹개발");
				  				  
				// 2-2) 숫자 + 숫자 = 숫자
				 System.out.println( 2000000 + 300000);
				 
				// 2-3) 문자열 + 숫자 = 문자열
				System.out.println("급여: " + 2300000);
				 
				// 2-4) 숫자 + 문자열 = 문자열
		        System.out.println(10000000 + "원");
		
		        System.out.println("급여: " + 2000000 + 300000 + "원");
		        System.out.println("급여: " + (2000000 + 300000)+ "원");
		
		
		
				
	}

}
