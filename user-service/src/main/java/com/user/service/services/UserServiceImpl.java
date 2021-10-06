package com.user.service.services;

import java.util.List;

import com.user.service.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	List<User> list = List.of(
			new User(11L,"Shital" ,"999869570"),
			new User(12L,"Rasika" ,"7499169570"),
			new User(12L,"Neha" ,"9899169570")
	);
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
