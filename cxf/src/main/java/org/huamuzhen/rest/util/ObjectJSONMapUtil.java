package org.huamuzhen.rest.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.huamuzhen.model.User;

public final class ObjectJSONMapUtil {
	
	public final static String UserToJSON(User user){
		
		String json=null;
		try {
			json = (String)new ObjectMapper().writeValueAsString(user);
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
		User user = new User();
		user.setName("aaa");
		user.setAge(11);
		System.out.println(UserToJSON(user));
	}

}
