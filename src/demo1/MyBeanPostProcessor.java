package demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


//我们编写BeanPostProcessor接口的一个实现类: MyBeanPostProcessor.java
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("[BeanPostProcessor接口]--调用BeanPostProcessor的构造方法");
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[BeanPostProcessor接口]--调用postProcessAfterInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("[BeanPostProcessor接口]--调用postProcessBeforeInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
	}

}
