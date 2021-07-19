package com.springbook.biz;

public class TVUser {
 
	public static void main(String[] args) {
		
		/*
		TV tv = new SamsungTV();
		tv.poweron();
		tv.poweroff();
		tv.volumeup();
		tv.volumedown();
		
		TV tv1 = new LgTv();
		tv1.poweron();
		tv1.poweroff();
		tv1.volumeup();
		tv1.volumedown();
		*/
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		tv.poweron();
		tv.poweroff();
		tv.volumeup();
		tv.volumedown();
		
		
		
				
	}
}
