package basicSyntax;

public class Variables {

	public static void main(String[] args) {
		int num1 = 9;
		double num2 = 0.9;
		String iLike = "私の好きな";
		String integer = "整数";
		String decimal = "小数";
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(iLike + integer + "は" + num1 + "です。");
		System.out.println(iLike + decimal + "は" + num2 + "です。");
	}

}