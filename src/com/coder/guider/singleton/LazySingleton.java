package com.coder.guider.singleton;

public class LazySingleton {
	
	
	// 最简单的单例实现  不考虑多线程因素
	
	private static LazySingleton ins;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		return ins ==null? ins = new LazySingleton():ins;
	}
	

}
