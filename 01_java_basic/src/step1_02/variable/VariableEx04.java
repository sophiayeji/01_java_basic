package step1_02.variable;

public class VariableEx04 {

	public static void main(String[] args) {
		// 
		/*
		 * 
		 * # 변수의 생명주기(scope , life cycle)
		 * 
		 * */
		
		int x = 10;
		
		if(true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);
//			System.out.println(z); // 오류
		
		}
		
		if(true) {
			int z = 3;
			System.out.println(x);
//			System.out.println(y); // 오류 
			System.out.println(z);
		
		}
		System.out.println(x);
//		System.out.println(y); // 오류
//		System.out.println(z); // 오류 
	}

}
