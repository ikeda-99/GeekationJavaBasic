package objectPractice;

class Apartment extends Property{
	private String space;
	
	Apartment(String name, String owner, String type, int price, String space){
		super(name, owner, type, price);
		this.space = space;
	}
	
	public void display() {
		System.out.println("=============================");
		super.display();
		System.out.println("間取り: " + space);
		System.out.println("=============================");
	}
	
	public String getSpace() {
		return this.space;
	}
	
	public void setSpace(String space) {
		this.space = space;
	}
}