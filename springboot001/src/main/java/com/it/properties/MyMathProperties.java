package com.it.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * # 随机字符串
com.it.mymath.value=${random.value}
# 随机int
com.it.mymath.number=${random.int}
# 随机long
com.it.mymath.bignumber=${random.long}
# 10以内的随机数
com.it.mymath.test1=${random.int(10)}
# 10-20的随机数
com.it.mymath.test2=${random.int[10,20]}
 * @author yang
 *
 */

@Component
public class MyMathProperties {
	@Value("${com.it.mymath.value}")
	private String value ;
	@Value("${com.it.mymath.number}")
	private String number ;
	@Value("${com.it.mymath.bignumber}")
	private String bignumber ;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBignumber() {
		return bignumber;
	}
	public void setBignumber(String bignumber) {
		this.bignumber = bignumber;
	}
	@Override
	public String toString() {
		return "MyMathProperties [value=" + value + ", number=" + number + ", bignumber=" + bignumber + "]";
	}
	
	
}
