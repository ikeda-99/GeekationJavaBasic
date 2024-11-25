package objectPractice;

class Land extends Property{
	private double space;

	Land(String name, String owner, String type, int price, double space){
		super(name, owner, type, price);
		this.space = space;
	}
	
	public void display() {
		System.out.println("=============================");
		super.display();
		System.out.println("間取り: " + space + "㎡");
		System.out.println("=============================");
	}
	
	public double getSpace() {
		return this.space;
	}
	
	public void setSpace(double space) {
		this.space = space;
	}
}