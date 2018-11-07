package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.StudentBean;

public class StudentBeanTest {

	public static void main(String[] args) {
		System.out.println("--------------【初始化容器】---------------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-------------------【容器初始化成功】------------------");
		//得到studentBean，并显示其信息
		StudentBean studentBean = applicationContext.getBean("studentBean",StudentBean.class);
		System.out.println(studentBean);
		System.out.println("--------------------【销毁容器】----------------------");
		((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
	}
}
