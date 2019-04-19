package com.zhujunwei.spring.demo2;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	/**
	 * bean的生命周期(@PostConstruct\@PreDestroy)、作用范围（Scope）
	 */
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService1 = (CustomerService) applicationContext.getBean("customerService");
		customerService1.save();
		CustomerService customerService2 = (CustomerService) applicationContext.getBean("customerService");
		customerService2.save();
		System.out.println(customerService1==customerService2);
		applicationContext.close();
	}
}
