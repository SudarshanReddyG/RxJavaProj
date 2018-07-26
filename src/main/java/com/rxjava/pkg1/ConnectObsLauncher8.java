package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectObsLauncher8 {
	
	public static void main(String[] args) {
		
		ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").publish();
		
		source.subscribe(str -> System.out.println("Observer 1 :: "+str));
		
		source.map(String::length).subscribe(num -> System.out.println("Observer 2 :: "+num));
		
		source.map(String::length).filter(num -> num>=5).subscribe(num -> System.out.println("Observer 3 :: "+num));
		
		source.connect();
		
	}

}
