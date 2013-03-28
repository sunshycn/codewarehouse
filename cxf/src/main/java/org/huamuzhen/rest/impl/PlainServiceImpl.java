package org.huamuzhen.rest.impl;

import org.huamuzhen.rest.PlainService;
import org.springframework.stereotype.Component;

@Component("plainService")
public class PlainServiceImpl implements PlainService {

	@Override
	public String plain(String plain) {
		System.out.println(plain);
		return "ok";
	}

}
