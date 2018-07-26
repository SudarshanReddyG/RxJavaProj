package com.rxjava.pkg1;

import io.reactivex.Observable;

public class DeferLauncher16 {
	
	private static final int INIT_VAL = 1;
	private static int TOTAL_COUNT = 12;
	
	public static void main(String[] args) {
		
		Observable<Integer> observable = Observable.defer(() -> Observable.range(INIT_VAL, TOTAL_COUNT));
		
		observable.subscribe(num -> System.out.println("Received Observable 1 :: "+num));
		
		TOTAL_COUNT = 20;
		
		observable.subscribe(num -> System.out.println("Received Observable 2 :: "+num));
	}

}
