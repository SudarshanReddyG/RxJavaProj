package com.rxjava.pkg1;

import io.reactivex.Observable;

public class EmptyLauncher13 {
	
	public static void main(String[] args) {
		
		Observable<String> emptyObservable = Observable.empty();
		
		emptyObservable.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed!!"));
	}

}
