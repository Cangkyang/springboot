package com.it.properties;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPropertiesTest {
	
	@Autowired
	private UserProperties userProperties ;
	
	@Test
	public void test() {
		Assert.assertEquals(userProperties.getName(), "yck");
		Assert.assertEquals(userProperties.getPassword(), "yck123");
	}

}
