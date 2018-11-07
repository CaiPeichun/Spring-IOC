package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.CollectionBean;
//测试集合属性注入
public class CollectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean = context.getBean("collection", CollectionBean.class);
		System.out.println(collectionBean.toString());
	}
}
