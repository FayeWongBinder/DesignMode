package com.single;
/**
 * ����ģʽ
 * @author 54901
 *
 */
public class SingleOne {
	
	private static SingleOne sInstance=new SingleOne();
	private SingleOne() {
		
	}
	public static SingleOne getInstance() {
		return sInstance;
	}

}
