package demo1;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
/*
 * 实现InstantiationAwareBeanPostProcessor接口，
 * 为了编程方便我们直接通过继承Spring中
 * 已经提供的一个实现了该接口的适配器类
 * InstantiationAwareBeanPostProcessorAdapter来进行测试。
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
	//实例化bean后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("[InstantiationAwareBeanPostProcessor接口]--调用InstantiationAwareBeanPostProcessor接口的postProcessAfetrInstantiation方法");
	        return null;
	
	}

	//实例化bean之前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor接口]--调用InstantiationAwareBeanPostProcessor接口的postProcessBeforeinstantiation方法");
        return bean;

	}

	//注入某个属性前调用
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor接口]--调用InstantiationAwareBeanPostProcessor接口的postProcessPropertyValues方法");
		return pvs;
	}

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("[InstantiationAwareBeanPostProcessor接口]--调用InstantiationAwareBeanPostProcessor构造方法");
	}

}
