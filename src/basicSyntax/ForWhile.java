package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
//		for (int number = 1; number <= 100; number ++) {
//		if(number % 3 == 0 && number % 5 == 0) {
//			System.out.println(number + "Fizz" + "Buzz");
//		}else if(number % 3 == 0) {
//			System.out.println(number + "Fizz");
//		}else if(number % 5 == 0) {
//			System.out.println(number + "Buzz");
//		}
//		else {
//			System.out.println(number);
//		}
//		}
		
		
		
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for (int i = 0; i < languages.length; i++) {
<<<<<<< HEAD
			if(languages[i] == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}else if(languages[i] == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}else {
				System.out.println(languages[i]);
=======
			System.out.println(languages[i]);
			if(languages[i] == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}else if(languages[i] == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
>>>>>>> branch 'for-while' of git@github.com:ikeda-99/GeekationJavaBasic.git
			}
		}
	}
}