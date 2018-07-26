package com.rxjava.pkg1;

import io.reactivex.Observable;

public class Launcher6 {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		observable.subscribe(str -> System.out.println("Observer 1 Received : "+str));
		
		observable.subscribe(str -> System.out.println("Observer 2 Received : "+str));
		
		observable.map(String::length).filter(num -> num>=5).subscribe(num -> System.out.println("Observer 3 Received : "+num));
	}

}
