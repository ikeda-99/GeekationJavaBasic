package basicSyntax;

public class  ComparisonLogicalOperators{

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		boolean isGreaterA = a > b;
		
		System.out.println(isGreaterA);
		
		
		
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean fine = (isSunny && isWarm);
		
		System.out.println(isSunny && isWarm);
		
		
		
		int x = 1;
		int y = 2;
		
		boolean evenNum = (x > 0 && y %2 == 0);
		
		System.out.println(evenNum);
		
		
		
		boolean hasPermission = ! false;
		
		System.out.println(hasPermission);
	}

}