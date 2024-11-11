package basicSyntax ;

public class MethodPractice {

	public static void main (String[] args) {
		
		int a = 10;
		int b = 2;
		
		int sumResult = sumNumbers(a, b);
		int subResult = subNumbers(a, b);
		int mulResult = mulNumbers(a, b);
		int divResult = divNumbers(a, b);
		
		results(sumResult);
		results(subResult);
		results(mulResult);
		results(divResult);
	}

		public static int sumNumbers(int a , int b) {
			int sum = a + b ;

			return sum;
		}

		public static int subNumbers(int a , int b) {
			int different = a - b ;

			return different ;
		}

		public static int mulNumbers(int a , int b) {
			int product = a * b ;

			return product ;
		}

		public static int divNumbers(int a , int b) {
			int quotient = a / b ;

			return quotient ;
		}
		
		public static void results(int result) {
			System.out.println("計算結果は{" + result + "}です。");
		}
}
