package step1_05.controlStatement;
//2023-02-14 20:03~20:14
import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.println("***메뉴번호를 입력하세요: ");
		 	int menuNum = scan.nextInt();
		 
		System.out.println("***투입할 현금을 입력하세요: ");
		 	int cash = scan.nextInt();
		
		if(menuNum ==1) {
			if(cash >= price1) System.out.println("잔돈:" + (cash-price1));
			if(cash < price1) System.out.println("잔액이 부족합니다.");
		}
		 
		if(menuNum ==2) {
			if(cash >= price2) System.out.println("잔돈:" + (cash-price1));
			if(cash < price2) System.out.println("잔액이 부족합니다.");
		}

		if(menuNum ==3) {
			if(cash >= price3) System.out.println("잔돈:" + (cash-price1));
			if(cash < price3) System.out.println("잔액이 부족합니다.");
		}
	}

}
