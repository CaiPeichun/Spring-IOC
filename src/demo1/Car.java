package demo1;
//演示构造方法注入属性
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
