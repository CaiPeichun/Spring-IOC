package demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


//���Ǳ�дBeanPostProcessor�ӿڵ�һ��ʵ����: MyBeanPostProcessor.java
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("[BeanPostProcessor�ӿ�]--����BeanPostProcessor�Ĺ��췽��");
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[BeanPostProcessor�ӿ�]--����postProcessAfterInitialization����������ɶ�"+beanName+"�����Խ��и��ġ�");
        return bean;
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("[BeanPostProcessor�ӿ�]--����postProcessBeforeInitialization����������ɶ�"+beanName+"�����Խ��и��ġ�");
        return bean;
	}

}
