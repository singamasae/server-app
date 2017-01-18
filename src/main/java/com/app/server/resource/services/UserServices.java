package com.app.server.resource.services;

import java.util.List;

import com.app.server.resource.model.Menu;
import com.app.server.resource.model.User;

public interface UserServices {
	User findByUserName(String userName);

	List<Menu> findMenuByUserName(String userName);
}
