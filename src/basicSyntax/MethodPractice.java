package basicSyntax ;

public class MethodPractice {
	
	public static void main (String[] args) {
		System.out.println("計算結果は{" + sumNumbers(10,2) + "}です。");
		System.out.println("計算結果は{" + subNumbers(10,2) + "}です。");
		System.out.println("計算結果は{" + mulNumbers(10,2) + "}です。");
		System.out.println("計算結果は{" + divNumbers(10,2) + "}です。");
	}
	
	public static int sumNumbers(int a , int b) {
		int sum = a + b ;
		
		return sum;
	}
	
	public static int subNumbers(int a , int b) {
		int sum = a - b ;
		
		return sum ;
	}
	
	public static int mulNumbers(int a , int b) {
		int sum = a * b ;
		
		return sum ;
	}
	
	public static int divNumbers(int a , int b) {
		int sum = a / b ;
		
		return sum ;
	}
}
