package com.zhujunwei.spring.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService")
@Scope("prototype")
public class CustomerService {
	
	@PostConstruct //初始化
	public void init() {
		System.out.println("CustomerService...init()方法");
	}
	public void save() {
		System.out.println("CustomerService...save()方法");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("CustomerService...destory()方法");
	}
}
