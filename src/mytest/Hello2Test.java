package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.HelloService;
//p���ƿռ�����ע�����
public class Hello2Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = applicationContext.getBean("hello3", HelloService.class);
		helloService.sayHello();
	}

}
