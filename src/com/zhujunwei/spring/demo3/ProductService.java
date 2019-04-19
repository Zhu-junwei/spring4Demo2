package com.zhujunwei.spring.demo3;

import javax.annotation.Resource;

public class ProductService {
	
	@Resource
	private ProductDao productDao ;
	@Resource
	private OrderDao orderDao ;
	
	public void save() {
		System.out.println("ProductService..save()方法");
		productDao.save();
		orderDao.save();
	}
}
