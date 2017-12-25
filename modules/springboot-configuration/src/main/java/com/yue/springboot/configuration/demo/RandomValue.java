package com.yue.springboot.configuration.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 随机数
 * 
 * @author zhangyue
 * @since 2017-12-23 11:52:51
 */
@Component
public class RandomValue {
	
	@Value("${com.yue.springboot.configuration.value}")
	private String value;
	
	@Value("${com.yue.springboot.configuration.number}")
	private int number;
	
	@Value("${com.yue.springboot.configuration.bignumber}")
	private long bigNumber;
	
	@Value("${com.yue.springboot.configuration.uuid}")
	private String uuid;
	
	@Value("${com.yue.springboot.configuration.lessThanTen}")
	private int then;
	
	@Value("${com.yue.springboot.configuration.range}")
	private long range;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getBigNumber() {
		return bigNumber;
	}

	public void setBigNumber(long bigNumber) {
		this.bigNumber = bigNumber;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getThen() {
		return then;
	}

	public void setThen(int then) {
		this.then = then;
	}

	public long getRange() {
		return range;
	}

	public void setRange(long range) {
		this.range = range;
	}

}
