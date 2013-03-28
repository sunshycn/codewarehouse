package org.huamuzhen.rest.impl;

import org.huamuzhen.model.Operator;
import org.huamuzhen.model.Query;
import org.huamuzhen.model.SingleQuery;
import org.huamuzhen.rest.QueryService;
import org.springframework.stereotype.Component;

@Component("queryService")
public class QueryServiceImpl implements QueryService {

	@Override
	public String createQuery(Query query) {
		SingleQuery s = (SingleQuery)query;
		System.out.println(s);
		System.out.println(s.getOperator() == Operator.EQUALS);
		return "ok";
	}

}
