package org.huamuzhen.rest.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.huamuzhen.model.GroupUser;
import org.huamuzhen.model.Operator;
import org.huamuzhen.model.SingleQuery;
import org.huamuzhen.model.User;

public final class ObjectJSONMapUtil {
	
	
	public  final static <T> String ObjectToJSON(T object){
		String json=null;
		try {
			json = (String)new ObjectMapper().writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
		
	}
	
	public static void main(String args[]){
		User user = new User.Builder().name("user1").age(11).build();

		System.out.println(ObjectToJSON(user));
		
		User user2 = new User.Builder().name("user2").age(22).build();
		
		GroupUser groupUser = new GroupUser();
		groupUser.getAttrs().add("attr1");
		groupUser.getAttrs().add("attr2");
		groupUser.setGroupName("groupName1");
		groupUser.getUsers().add(user);
		groupUser.getUsers().add(user2);
		System.out.println(ObjectToJSON(groupUser));
		
		SingleQuery s = new SingleQuery();
		s.setAttribute("attr1");
		s.setValue("value1");
		s.setOperator(Operator.EQUALS);
		System.out.println(ObjectToJSON(s));
		
	}

}
