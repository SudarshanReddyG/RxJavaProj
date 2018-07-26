package com.rxjava.operator.transform;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class DelayLauncher7 {
	
	public static void main(String[] args) {
		Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
		
		observable.delay(3, TimeUnit.SECONDS).subscribe(System.out::println);
		
		sleep(5000);
	}
	
	private static void sleep(long num) {
		try {
			Thread.sleep(num);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
