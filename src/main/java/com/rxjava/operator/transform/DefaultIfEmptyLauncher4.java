package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class DefaultIfEmptyLauncher4 {
	
	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("One", "Two", "Three", "Four", "Five");
		
		observable.filter(str -> str.startsWith("Z")).defaultIfEmpty("None").subscribe(System.out::println);
		
	}

}
