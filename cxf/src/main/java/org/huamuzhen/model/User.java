package org.huamuzhen.model;

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
@XmlType(name = "User", propOrder = {
		"name","age"
})
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonAutoDetect(value=JsonMethod.NONE)
public class User {
	
	@XmlElement
	@JsonProperty
	private String name;
	
	@XmlElement
	@JsonProperty
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	public static class Builder {
		private String name = "";
		private int age = 0;
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder age(int age){
			this.age = age;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
		
	}
	
	public User(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
	}
	
	public User(){
	}
	
/*	public User name(String name){
		this.name = name;
		return this;
	}
	
	public User age(int age){
		this.age = age;
		return this;
	}*/
	
}
