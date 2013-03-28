package org.huamuzhen.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupUser", propOrder = {
		"groupName","users","attrs"
})
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonAutoDetect(value=JsonMethod.NONE)
public class GroupUser {
	
	@XmlElement
	@JsonProperty
	public String groupName;
	
	@XmlElement
	@JsonProperty
	public List<User> users = new ArrayList<User>(0);
	
	@XmlElement
	@JsonProperty
	public List<String> attrs = new ArrayList<String>(0);

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<String> getAttrs() {
		return attrs;
	}

	public void setAttrs(List<String> attrs) {
		this.attrs = attrs;
	}

	@Override
	public String toString() {
		return "GroupUser [groupName=" + groupName + ", users=" + users
				+ ", attrs=" + attrs + "]";
	}
	
	

}
