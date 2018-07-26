package com.rxjava.pkg1;

import io.reactivex.Observable;

public class FrmCallable2Launcher17 {
	
	public static void main(String[] args) {
		
		Observable<Integer> observableErroHandle = Observable.fromCallable(() -> 1/0);
		
		observableErroHandle.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed!!"));
	}

}
