package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class SwitchIfEmptyLauncher5 {
	
	public static void main(String[] args) {
		
		Observable<String> observable1 = Observable.just("One", "Two", "Three", "Four", "Five");
		
		Observable<String> observable2 = Observable.just("Apple", "Bannana", "Guava");
		
		observable1.filter(str -> str.startsWith("m")).switchIfEmpty(observable2).subscribe(System.out::println);
		
	}

}
