package com.rxjava.pkg1;

import io.reactivex.Observable;

public class RangeLauncher9 {
	
	public static void main(String[] args) {
		Observable<Integer> values = Observable.range(2, 10);
		
		values.subscribe(num -> System.out.println("Received :: "+num));
	}

}
