package com.rxjava.pkg1;

import io.reactivex.Observable;

public class FrmCallable1Launcher17 {
	
	public static void main(String[] args) {
		
		Observable<Integer> observableError = Observable.just(1/0);
		
		observableError.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
	}

}
