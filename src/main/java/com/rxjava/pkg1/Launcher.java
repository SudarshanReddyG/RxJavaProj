package com.rxjava.pkg1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		observable.subscribe(System.out::println);
		
		observable.map(String::length).subscribe(System.out::println);
		
		observable.subscribe(System.out::println);
		
		Observable<Long> observableInterval = Observable.interval(1, TimeUnit.SECONDS);
		
		observableInterval.subscribe(System.out::println);
		
		sleep(5000);
	}
	
	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
