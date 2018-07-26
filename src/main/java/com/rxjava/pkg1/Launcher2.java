package com.rxjava.pkg1;

import io.reactivex.Observable;

public class Launcher2 {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.create(emitter -> {
			try {
				emitter.onNext("Alpha");
				emitter.onNext("Beta");
				emitter.onNext("Gamma");
				emitter.onNext("Delta");
				if(args.length>0)
					throw new RuntimeException("Manual Error");
				emitter.onNext("Epsilon");
				emitter.onComplete();
			} catch(Throwable throwable) {
				emitter.onError(throwable);
			}
		});
		
		System.out.println("After pushing data.");
		
		observable.subscribe(s -> System.out.println("Received : "+ s), Throwable::printStackTrace);
		
		System.out.println("After observing data.");
		
		Observable<Integer> lengths = observable.map(String::length);
		
		Observable<Integer> filtered = lengths.filter(num -> num>=5);
		
		filtered.subscribe(System.out::println);
	}

}