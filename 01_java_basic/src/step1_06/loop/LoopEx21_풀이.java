package step1_06.loop;
//2023 02-16 21:00~
import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_풀이 {

	public static void main(String[] args) {
		 Random ran= new Random();
		 Scanner scan= new Scanner(System.in);
		 
		 int score =0;
		 int answerCnt = 0;
		 
		 for(int i =1; i <=5; i++) {
			 int x = ran.nextInt(8) + 2;
			 int y = ran.nextInt(9) + 1;
			 int answer = x*y;
			 
			 System.out.println("계산 하세요 :" + x + "x" + y);
			 System.out.println("정답:" );
			 int myAnswer = scan.nextInt();
			 if(myAnswer == answer) System.out.println("딩동댕! 20점 추가");
			                        answerCnt++;
             if (myAnswer != answer) System.out.println("땡");
              
		 }
		 
		     score = answerCnt * 20;
		     System.out.println("총점수 :" + score);
		     
		     scan.close();
		 
	}

}
