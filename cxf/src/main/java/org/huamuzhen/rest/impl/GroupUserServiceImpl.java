package org.huamuzhen.rest.impl;

import org.huamuzhen.model.GroupUser;
import org.huamuzhen.rest.GroupUserService;
import org.springframework.stereotype.Component;

@Component("groupUserService")
public class GroupUserServiceImpl implements GroupUserService {

	@Override
	public String createGroupUser(GroupUser groupUser) {
		System.out.println(groupUser.toString());
		return "ok";
	}

}
