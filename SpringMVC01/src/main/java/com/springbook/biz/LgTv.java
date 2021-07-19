package com.springbook.biz;

public class LgTv implements TV{
	
	public void poweron() {
		System.out.println("전원켠다.(lg)");
	}
	public void poweroff() {
		System.out.println("전원끈다.(lg)");
	}
	public void volumeup() {
		System.out.println("소리올린다.(lg)");
	}
	public void volumedown() {
		System.out.println("소리내린다.(lg)");
	}

}
