package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.Single;

public class SingleLauncher18 {
	
	public static void main(String[] args) {
		
		Single.just("Hello").subscribe(str -> System.out.println("Inside Single for Observable 1 with value "+str), Throwable::printStackTrace);
		
		Observable<String> multipleValues = Observable.just("One", "Two", "Three");
		
		multipleValues.first("Nil").subscribe(str -> System.out.println("Inside Single for Observable 2 with value "+str), Throwable::printStackTrace);
	}
}
