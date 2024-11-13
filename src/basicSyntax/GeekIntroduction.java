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

		specialSkill(3,50);
	}

	public static void specialSkill(int num1, int num2) {

		if (num1 <= 0 || num2 <= 0) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}else if (num1 > num2){
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}else if (num1 >= 300 || num2 >= 300){
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}

		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("{対象の値}は3の倍数かつ5の倍数です。");
				continue;
			}else if (i % 3 == 0) {
				System.out.println("{対象の値}は3の倍数です。");
				continue;
			}else if (i % 5 == 0) {
				System.out.println("{対象の値}は5の倍数です。");
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
