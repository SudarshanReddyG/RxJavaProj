package com.rxjava.pkg1;

import io.reactivex.Observable;

public class Launcher5 {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		observable.map(String::length).filter(num -> num >= 5).subscribe(num -> System.out.println("Received : "+num), Throwable::printStackTrace, () -> System.out.println("Completed"));
	}

}
