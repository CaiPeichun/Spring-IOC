package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.HelloService;

public class HelloTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
		helloService.sayHello();
	}

}
