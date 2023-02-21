package step1_03.operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		
		// 예시 1)
		int totalGrade = 61; 
		System.out.println(totalGrade >= 60 ? "합격" : "불합격"); // 삼항 (조건, 결과1 , 결과2) 
		System.out.println(totalGrade < 60 ? "불합격" : "합격");
		
		
		// 예시 2)
		char result = totalGrade >= 60 ? 'p' : 'f'; 
		System.out.println(result);
		
	
		
		/*
		 * 
		 * # 삼항 연산자 (항이3개) / 이항 / 단항(항이 1개) 
		 * 
		 * [ 형식 ]
		 * 
		 *  조건식 ? 참일때의 결과값 : 거짓일때의 결과값
		 * 
		 * */


	}

}
