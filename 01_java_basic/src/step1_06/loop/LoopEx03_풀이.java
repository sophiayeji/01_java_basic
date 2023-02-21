package step1_06.loop;
//2023-02-15 20:25 ~ 20:32 
//# 반복문 기본문제[2단계]

public class LoopEx03_풀이 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		
		int i =1;
		while(i <= 10 ) {
			if(i <3  || i >=7) {	
				System.out.println(i);
			}		
		i++;
		} 
		
		
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		
	    i =1;
		int sum =0;
		while(i <= 10 ) {
			if(i <3  || i >=7) {
				sum= sum+i;
			}		
		i++;
		} 
		System.out.println("합: " + sum);
		
				
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		
		int cnt =0;
		i=1;
		while(i <= 10 ) {
			if(i <3  || i >=7) {
				cnt++;
			}		
		i++;
		} 
		System.out.println("개수: " + cnt);
		
		
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
        i=1;
        int ttl = 1;
        while (i <= 4) {
        	
        	i++;
        	ttl += i;  
        	
        }
          System.out.println("합 : " + ttl);
			
		
	}

}
