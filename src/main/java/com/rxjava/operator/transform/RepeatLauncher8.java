package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class RepeatLauncher8 {
	
	public static void main(String[] args) {
		Observable<String> observable1 = Observable.just("One", "Two", "Three", "Four");
		
		observable1.repeat(2).subscribe(System.out::println);
	}

}
