package step1_06.loop;

public class loopEx01 {

	public static void main(String[] args) {
		/*
		 *  
		 *  # 반복문 while (반복: 비슷한 것, 같은것을 되풀이할 떄) 
		 *  
		 *  [ 형식 ]
		 *  
		 *  초기식;
		 *  while ( 조건식 ) {
		 *  
		 *  	조건식이 참일동안 실행할 ***명령어;
		 *  	증감식;	
		 *  
		 *  }
		 * 
		 * 	- 반복문의 조건 3가지
		 * 		1) 초기식 : 조건식을 false로 바꾸기 위한 초깃값 셋업
		 * 		2) 조건식 : 조건판별
		 * 		3) 증감식 : 조건식을 false로 바꾸기 위한 증가,감소
		 * 
		 * 
		 * 반복
		 * for, (for each)
		 * while 
		 * 2tier-> do while 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		int i =0; // 초기식 (reset이 아닌 initiate) 
		
		System.out.println("반복문 시작");

		while(i < 10) { // true인 동안 명령어를 출력함 , 조건식 
			System.out.println("명령어");
			i++; // 증감식              //i=+1; // i = i+1;				
		}
		System.out.println("반복문 종료");
	}

}
