package com.it.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProperties {
	@Value("${com.it.user.name}")
	private String name ;
	@Value("${com.it.user.password}")
	private String password ;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserProperties [name=" + name + ", password=" + password + "]";
	}
	
}
