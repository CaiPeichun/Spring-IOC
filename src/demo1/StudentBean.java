package demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

//ѧϰbean����������
//ʵ�����ĸ��ӿڣ�InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware
public class StudentBean implements InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware{

	private String name;
	private int age;
	private String beanName;//ʵ����BeanNameAware�ӿڣ�spring���Խ�BeanNameע���������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("[setע��]--ע��student��name����");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("[setע��]--ע��student��age����");
		this.age = age;
	}
	

	private BeanFactory beanFactory;//ʵ����BeanFactory�ӿڣ�spring���Խ�BeanFactoryע���������
	
	public StudentBean() {
		System.out.println("[Bean]���췽��--�޲������췽��ִ��");
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", beanName=" + beanName + ", beanFactory=" + beanFactory
				+ "]";
	}
	
	//�Լ���д�ĳ�ʼ������
	public void myInit() {
		System.out.println("[init-method]--���������ļ���init-method�ĵ��÷���");
	}
	//�Լ���д�����ٷ���
		public void myDestroy() {
			System.out.println("[destroy-method]--���������ļ���destroy-method�ĵ��÷���");
		}
		
	//BeanNameAware�ӿڵķ���
	@Override
	public void setBeanName(String arg0) {
		this.beanName=arg0;
		System.out.println("[BeanNameAware�ӿ�]--����BeanNameAware��setBeanName�����õ�Bean������");
	}
	
	//BeanFactoryAware�ӿڵķ���
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory=arg0;
		System.out.println("[BeanFactoryAware�ӿ�]--����BeanFactoryAware��setBeanFactory�����õ�beanFactory����");
	}

	//DisposableBean�ӿڵķ���
	@Override
	public void destroy() throws Exception {
		System.out.println("[DisposableBean�ӿ�]--����DisposableBean�ӿڵ�destroy����");
	}

	//InitializingBean�ӿڵķ���
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[InitializingBean�ӿ�]--����InitializingBean�ӿڵ�afterPropertiesSet����");
	}

	
}
