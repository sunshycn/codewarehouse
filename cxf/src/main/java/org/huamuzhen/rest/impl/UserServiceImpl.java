package org.huamuzhen.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.huamuzhen.model.User;
import org.huamuzhen.rest.UserService;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Override
	public Response createUser(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return Response.status(Status.OK).build();
	}

}
