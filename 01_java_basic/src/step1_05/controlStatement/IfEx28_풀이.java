package step1_05.controlStatement;

import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장 // 입력 
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤) // 랜덤 
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접) // 입력
	comFinal에 comLeft 또는 comRight 저장 (랜덤) // 랜덤 
	
	3) 최종판정
*/
public class IfEx28_풀이 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 
  //1. 	가위바위보 2개씩 저장 // 입력 
//		   System.out.println("meLeft : " + meLeft);
		   int meLeft = scan.nextInt();
                   
 //          System.out.println("meRight :" + meRight);
           int meRight = scan.nextInt();
	}

}
