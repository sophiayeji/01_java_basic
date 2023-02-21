package step1_01.print; // 소속을 알리는 것 1) 패키지 선언문은 '항상' 첫줄에 위치한다. 
//
// 2) 주석(comment) : 설명문을 작성하기 위한 문법으로 프로그램의 실행에 영향을 미치치 않는다. 

// 2-1) 라인(line) 주석: 한줄 주석 

/*
 * 2-2) 블록(block) 주석: 여러줄 주석 -> /** 눌러서 + Enter클릭 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * * 애스터리스크/
 */


public class PrintEx01 {

	public static void main(String[] args) {// main함수의 {}안에서 프로그래밍을 한다. 
		
		// tab으로 들여쓰기 이후에 코드를 작성한다. 
		
		//System.out.println(데이터) : 데이터를 화면에 출력한 뒤 줄을 바꾼다.(개행)   
		System.out.println("==========");
		System.out.println("메뉴 선택");
		System.out.println("==========");
		
		// 출력데이터가 없으면 줄바꿈기능만 적용하여 한줄을 띄운다. 
		System.out.println(); 
		
		System.out.println("1) 로그인");
		System.out.println("2) 로그아웃");
	    System.out.println("3) 종료");
	    System.out.println();
	   
	    //System.out.print(데이터): 데이터를 화면에 출력한 뒤 줄을 바꾸지 않는다. 
	    System.out.print("-상품 주문 정보 [");
	    System.out.print("가격 : 10000원 /");
	    System.out.print("할인율 : 10% /");
	    System.out.print("결제금액 : 9000원 ]");
	    
	    
	}

}
