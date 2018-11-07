package demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		System.out.println("[BeanFactoryPostProcessor�ӿ�]--����BeanFactoryPostProcessorʵ���๹�췽��");
	}

	/**
     * ��дBeanFactoryPostProcessor�ӿڵ�postProcessBeanFactory������
     * ��ͨ���÷�����beanFactory��������
     */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("[BeanFactoryPostProcessor�ӿ�]--����BeanFactoryPostProcessor�ӿڵ�postProcessBeanFactory����");
		BeanDefinition beanDefinition = arg0.getBeanDefinition("studentBean");
		beanDefinition.setAttribute("age", "22");
	
	}

}
