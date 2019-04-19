package com.zhujunwei.spring.demo1;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImp implements UserService {

	//按照类型、名称注入
//	@Autowired
//	@Qualifier(value="userDao")
	
	@Resource
	private UserDao userDao ;
	
	@Override
	public void save() {
		System.out.println("UserServiceImp save方法执行了。。。");
		userDao.save();
	}

}
