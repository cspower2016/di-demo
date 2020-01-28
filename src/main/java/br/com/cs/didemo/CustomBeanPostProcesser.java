package br.com.cs.didemo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
 
@Component // Is going to be called for all the beans in the context, so we can do everything with the bean life cycle
public class CustomBeanPostProcesser implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {

		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).beforeInit();
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {

		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).afterInit();
		}

		return bean;
	}
}
