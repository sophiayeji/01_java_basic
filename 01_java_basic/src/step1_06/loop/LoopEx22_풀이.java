package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran= new Random();
		
		int ansCnt = 0;
		
 //1. 
		for (int i=1; i<=100; i++); {
			int dataNum = ran.nextInt(101) +2;
			System.out.println(dataNum);

//2. 		
			System.out.println("정답은: ");
			int myNum =scan.nextInt(); 
			if(myNum == dataNum) System.out.println("정답");							
			
			while(myNum != dataNum) 
				              System.out.println("땡");
				              ansCnt--;
//				              
			
		}
			 int score = 100- (ansCnt*5);
			 System.out.println("총점수: " + score + "점");
			
		}
		
	}
	
