package org.huamuzhen.codewarehouse.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Bean1 implements InitializingBean,DisposableBean{
	
	public Bean1(){
		System.out.println("Bean1 constructor");
	}
	
	public void initMethod(){
		System.out.println("init method");
	}
	
	public void destroyMethod(){
		System.out.println("destory method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() DisposableBean");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() InitializingBean");
		
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("preDestroy");
	}

}
