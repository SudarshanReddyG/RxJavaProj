package com.rxjava.pkg1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class IntervalConObsLauncher11 {
	
	public static void main(String[] args) {
		ConnectableObservable<Long> source = Observable.interval(1, TimeUnit.SECONDS).publish();
		
		source.subscribe(num -> System.out.println("Received Observer 1 :: "+num));
		
		source.connect();
		
		sleep(5000);
		
		source.subscribe(num -> System.out.println("Received Observer 2 :: "+num));
		
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
