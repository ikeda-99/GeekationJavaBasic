package objectPractice;

public class Main {
	public static void main(String[] arg) {
		Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK");
		apartment.display();
		
		Land land = new Land("いい感じの土地", "山田 土地太郎" ,"土地", 8000000, 105.2);
		land.display();
		
		Property property = new Property("物件名", "所有者", "タイプ", 10000000);
		property.display();
		
//		System.out.println(apartment.getSpace());
//		System.out.println(land.getSpace());
		
//		apartment.setSpace("1LDK");
//		land.setSpace(80.3);
		
//		System.out.println(apartment.getSpace());
//		System.out.println(land.getSpace());
		
//		apartment.display();
//		land.display();
	}
}