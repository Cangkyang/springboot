package com.it.properties;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.arjuna.ats.internal.arjuna.objectstore.jdbc.drivers.mysql_ab_driver;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMathPropertiesTest {
	
	@Autowired
	private MyMathProperties mmp ; 
	
	@Test
	public void testGetNumber() {
		System.out.println(mmp.getNumber());
	}

	@Test
	public void testGetBignumber() {
		System.out.println(mmp.getBignumber());
	}

}
