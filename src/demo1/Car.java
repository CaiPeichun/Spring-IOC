package demo1;
//��ʾ���췽��ע������
public class Car {
	private String name;
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	private int price;
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
