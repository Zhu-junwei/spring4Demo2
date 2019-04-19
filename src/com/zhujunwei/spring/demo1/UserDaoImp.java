package com.zhujunwei.spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImp implements UserDao {

	@Value("朱俊伟")
	private String name; 
	
	@Override
	public void save() {
		System.out.println("UserDaoImp save()方法执行了。。。"+name);
	}

}
