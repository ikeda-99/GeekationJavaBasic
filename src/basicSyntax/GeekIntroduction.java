package basicSyntax;

public class GeekIntroduction{

	public static void main(String[] args) {

		int age = 24;
		int height = 160;
		greeting (age, height);
	}

	public static void greeting(int age, int height) {

		String hello = "こんにちは! 私はGeek君でごわす。";
		String ageMessage = "年は" + age + "でごわす。";
		String heightMesseage = "身長は" + height + "でごわす。";

		System.out.println(hello);
		System.out.println(ageMessage);
		System.out.println(heightMesseage);

		specialSkill(6,9);
	}

	public static void specialSkill(int num1, int num2) {

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
			if (num1 <= 0 || num2 <= 0) {
				System.out.println("num1とnum2は0より大きい値にしてください。");
				break;
			}else if (num1 > num2){
				System.out.println("num2はnum1より大きい値にしてください。");
				break;
			}else if (num1 >= 300 || num2 >= 300){
				System.out.println("num1とnum2は300以下にしてください。");
				break;
			}else if (num1 % 3 == 0 && num2 % 5 == 0) {
				System.out.println("{対象の値}は3の倍数かつ5の倍数です。");
				continue;
			}else if (num1 % 3 == 0 || num2 % 3 == 0) {
				System.out.println("{対象の値}は3の倍数です。");
				continue;
			}else if (num1 % 5 == 0 || num2 % 5 == 0) {
				System.out.println("{対象の値}は5の倍数です。");
				continue;
			}
		}
	}
}
