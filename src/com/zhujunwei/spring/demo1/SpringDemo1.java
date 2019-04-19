package com.zhujunwei.spring.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring的IOC注解开发测试类
 * @author zhujunwei
 * 2019年4月18日 上午9:47:58
 */
public class SpringDemo1 {
	
	/**
	 * 传统方式
	 */
	@Test
	public void demo1() {
		UserDao userDao = new UserDaoImp();
		userDao.save();
	}
	
	/**
	 * Spring的IOC注解方式
	 */
	@SuppressWarnings("resource")
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	/**
	 * Spring的IOC注解方式
	 */
	@SuppressWarnings("resource")
	@Test
	public void demo3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}
}
