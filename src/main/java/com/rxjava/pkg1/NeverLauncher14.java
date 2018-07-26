package com.rxjava.pkg1;

import io.reactivex.Observable;

public class NeverLauncher14 {
	
	public static void main(String[] args) {
		
		Observable<String> obervableNever = Observable.never();
		
		obervableNever.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed!!"));
		
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
