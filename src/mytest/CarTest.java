package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.Car;
//�������Բ��ù�����ע��Ĳ���
public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car.toString());
	}

}
