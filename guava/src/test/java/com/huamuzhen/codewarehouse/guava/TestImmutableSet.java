package com.huamuzhen.codewarehouse.guava;

import org.junit.Assert;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;

public class TestImmutableSet {
	
	@Test
	public void test(){
		ImmutableSet<String> immutableSet = ImmutableSet.of("RED", "GREEN"); 
		Assert.assertEquals(immutableSet.size(), 2);
	}

}
