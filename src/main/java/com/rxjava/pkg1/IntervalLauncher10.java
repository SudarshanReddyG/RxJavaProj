package com.rxjava.pkg1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class IntervalLauncher10 {
	
	public static void main(String[] args) {
		Observable<Long> oberservableInterval = Observable.interval(1, TimeUnit.SECONDS);
		
		oberservableInterval.subscribe(lngVal -> System.out.println("Received Observer 1 :: "+lngVal));
		
		sleep(5000);
		
		oberservableInterval.subscribe(lngVal -> System.out.println("Received Observer 2 :: "+lngVal));
		
		sleep(5000);
	}

	private static void sleep(int numOfSeconds) {
		try {
			Thread.sleep(numOfSeconds);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

}
