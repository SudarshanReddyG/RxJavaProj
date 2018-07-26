package com.rxjava.operator.supress;


import io.reactivex.Observable;

public class FilterLauncher1 {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("One", "Two", "Three", "Four", "Five");
		
		observable.filter(num -> num.length()>3).subscribe(str -> System.out.println("Received Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
	}

}
