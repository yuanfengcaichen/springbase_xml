package club.codeqi.Components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: codeqi
 * @Description:
 * @Date: create in 2021/2/21 0021 11:26
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyBean".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 before 方法 拦截 lazyBean");
        }
        if ("accountFactorybean".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 before 方法 拦截 accountFactorybean");
        }
        if ("accountDao".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 before 方法 拦截 accountDao");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyBean".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 after 方法 拦截 lazyBean");
        }
        if ("accountFactorybean".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 after 方法 拦截 accountFactorybean");
        }
        if ("accountDao".equals(beanName)){
            System.out.println("MyBeanPostProcessor 调用了 after 方法 拦截 accountDao");
        }
        return bean;
    }
}
