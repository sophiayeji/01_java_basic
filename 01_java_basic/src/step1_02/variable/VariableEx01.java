package step1_02.variable;

public class VariableEx01 {

	public static void main(String[] args) {
		 
		
		//package step1_02.variable;
		//**외우기!!
        // 1. 정수 Integer(int), short, long 
		int refund;  // 변수의 선언
		refund = 200000; // 데이터 저장(대입) 
		System.out.println(refund);
		
		// 2. 실수: double, float  
		double memberWeight = 80.14;
        System.out.println(memberWeight);  
        
        //3. 문자 1개: character(char) 
		char activeYn = 'Y';
		System.out.println(activeYn);
		
		//4. 문자열(글자) : String (********중요!!!)
		String subjcectName = "백앤드 웹 개발";
		System.out.println(subjcectName);
		
		// 5. 참과 거짓 : boolean
		boolean isAdmin = true;
		System.out.println(isAdmin);
		
		System.out.println();
		
        // 변수의 특징(고유성) , unique 
		int goodsPrice = 18000;
		// int goodsPrice = 19000; // 똑같은 이름의 변수를 생성 할 수 없다. 
		
		goodsPrice = 19000; // 업데이트, 위 안의 내용에서 수정, 자료형을 생략했으므로 
		                    // 기존의 변수값을 수정한다. 
		goodsPrice = 20000; // 마지막에 남는다. 
		
		System.out.println(goodsPrice); // 가장 최근값 1개만 저장되어 있다. 
		
		// 변수의 초기값 (reset이 아니라 initiate(시작) )
		  int deliveryPrice;
		// 변수에 초기값을 지정하지 않으면 가비지데이터가(쓰레기데이터) 변수에 들어가 있다. 
		//System.out.println(deliveryPrice);
		
		  int tax = 0; // 0데이터로 초기값 지정 (tax라는 값이 있다라는 뜻!) 
		
	
		
		//
		/*
		 * 
		 *  # 변수 ( variable )
		 *  
		 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
		 *  
		 *  	1) 변수의 선언 그리고 초기화
		 *  	
		 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
		 *  	변수의 초기화	: nData = 0;    // 값 저장
		 *  
		 *  	
		 *  	2) 변수의 선언과 동시에 초기화
		 *  	
		 *  	int nData = 0;
		 *  	
		 *  
		 *  	3) 변수의 특징
		 *  	
		 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
		 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
		 *  
		 * 
		 * */



		
			}
			
	}


