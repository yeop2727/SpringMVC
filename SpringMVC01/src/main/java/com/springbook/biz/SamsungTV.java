package com.springbook.biz;

public class SamsungTV implements TV {
	
	public void poweron() {
		System.out.println("전원켠다.");
	}
	public void poweroff() {
		System.out.println("전원끈다.");
	}
	public void volumeup() {
		System.out.println("소리올린다.");
	}
	public void volumedown() {
		System.out.println("소리내린다.");
	}

	

}
