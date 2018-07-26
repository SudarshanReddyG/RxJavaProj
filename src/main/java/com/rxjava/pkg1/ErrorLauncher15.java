package com.rxjava.pkg1;

import io.reactivex.Observable;

public class ErrorLauncher15 {
	
	public static void main(String[] args) {
		Observable<String> errorObservable = Observable.error(new Exception("Crash and burn!!"));
		
		errorObservable.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed!!"));
	}

}
