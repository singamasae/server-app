package com.app.server.resource.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.server.resource.dao.MenuDao;
import com.app.server.resource.dao.UserDao;
import com.app.server.resource.model.Menu;
import com.app.server.resource.model.User;
import com.app.server.resource.services.UserServices;

@Service(value = "userServices")
@Transactional(value = "txManager", readOnly = true)
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserDao userDao;
	@Autowired
	private MenuDao menuDao;

	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.findByUserName(userName);
	}

	public List<Menu> findMenuByUserName(String userName) {
		// TODO Auto-generated method stub
		return menuDao.findByUserName(userName);
	}

}
