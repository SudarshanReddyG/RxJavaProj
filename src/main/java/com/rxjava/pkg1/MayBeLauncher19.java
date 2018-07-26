package com.rxjava.pkg1;

import io.reactivex.Maybe;
import io.reactivex.Observable;

public class MayBeLauncher19 {
	
	public static void main(String[] args) {
		Maybe<String> presentSource = Maybe.just("Hello");
		
		presentSource.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Complete!!!"));
		
		Maybe<String> emptySource = Maybe.empty();
		
		System.out.println("Before empty emission.");
		
		emptySource.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Complete!!!"));
		
		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		source.firstElement().subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Complete!!!"));
	}

}
