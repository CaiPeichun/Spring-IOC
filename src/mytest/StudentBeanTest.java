package mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo1.StudentBean;

public class StudentBeanTest {

	public static void main(String[] args) {
		System.out.println("--------------����ʼ��������---------------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-------------------��������ʼ���ɹ���------------------");
		//�õ�studentBean������ʾ����Ϣ
		StudentBean studentBean = applicationContext.getBean("studentBean",StudentBean.class);
		System.out.println(studentBean);
		System.out.println("--------------------������������----------------------");
		((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
	}
}
