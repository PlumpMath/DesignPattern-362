package com.coder.guider.singleton;

public class LazySyncSingleton {
	
	// 双检索的单例  最常用

	private volatile static LazySyncSingleton ins;
	
	private LazySyncSingleton(){}
	
	public  static LazySyncSingleton getInstance(){
		if (ins ==null) {
			synchronized (LazySyncSingleton.class) {
				return ins = new LazySyncSingleton();
			}
		}
		return ins;
		
	}
	
	
	
}
