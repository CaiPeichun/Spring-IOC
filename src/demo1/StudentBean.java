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

//学习bean的生命周期
//实现了四个接口：InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware
public class StudentBean implements InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware{

	private String name;
	private int age;
	private String beanName;//实现了BeanNameAware接口，spring可以将BeanName注入该属性中
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("[set注入]--注入student的name属性");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("[set注入]--注入student的age属性");
		this.age = age;
	}
	

	private BeanFactory beanFactory;//实现了BeanFactory接口，spring可以将BeanFactory注入该属性中
	
	public StudentBean() {
		System.out.println("[Bean]构造方法--无参数构造方法执行");
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", beanName=" + beanName + ", beanFactory=" + beanFactory
				+ "]";
	}
	
	//自己编写的初始化方法
	public void myInit() {
		System.out.println("[init-method]--调用配置文件中init-method的调用方法");
	}
	//自己编写的销毁方法
		public void myDestroy() {
			System.out.println("[destroy-method]--调用配置文件中destroy-method的调用方法");
		}
		
	//BeanNameAware接口的方法
	@Override
	public void setBeanName(String arg0) {
		this.beanName=arg0;
		System.out.println("[BeanNameAware接口]--调用BeanNameAware的setBeanName方法得到Bean的名称");
	}
	
	//BeanFactoryAware接口的方法
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory=arg0;
		System.out.println("[BeanFactoryAware接口]--调用BeanFactoryAware的setBeanFactory方法得到beanFactory引用");
	}

	//DisposableBean接口的方法
	@Override
	public void destroy() throws Exception {
		System.out.println("[DisposableBean接口]--调用DisposableBean接口的destroy方法");
	}

	//InitializingBean接口的方法
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[InitializingBean接口]--调用InitializingBean接口的afterPropertiesSet方法");
	}

	
}
