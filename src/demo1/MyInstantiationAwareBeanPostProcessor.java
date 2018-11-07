package demo1;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
/*
 * ʵ��InstantiationAwareBeanPostProcessor�ӿڣ�
 * Ϊ�˱�̷�������ֱ��ͨ���̳�Spring��
 * �Ѿ��ṩ��һ��ʵ���˸ýӿڵ���������
 * InstantiationAwareBeanPostProcessorAdapter�����в��ԡ�
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
	//ʵ����bean�����
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("[InstantiationAwareBeanPostProcessor�ӿ�]--����InstantiationAwareBeanPostProcessor�ӿڵ�postProcessAfetrInstantiation����");
	        return null;
	
	}

	//ʵ����bean֮ǰ����
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor�ӿ�]--����InstantiationAwareBeanPostProcessor�ӿڵ�postProcessBeforeinstantiation����");
        return bean;

	}

	//ע��ĳ������ǰ����
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("[InstantiationAwareBeanPostProcessor�ӿ�]--����InstantiationAwareBeanPostProcessor�ӿڵ�postProcessPropertyValues����");
		return pvs;
	}

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("[InstantiationAwareBeanPostProcessor�ӿ�]--����InstantiationAwareBeanPostProcessor���췽��");
	}

}
