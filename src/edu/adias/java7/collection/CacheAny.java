package edu.adias.java7.collection;

public class CacheAny<T> {
	
	private T t;
	
	public void add(T t){
		this.t =  t;
	}
	
	public T get(){
		return this.t;
	}

}
