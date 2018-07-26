package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class StartWithLauncher3 {
	
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Coffee", "Tea", "Milk", "Juice", "Water");
		
		observable.startWith("Menu is :::::").subscribe(System.out::println);
		
		observable.startWithArray("Menu is :::::", "-------------").subscribe(System.out::println);
	}

}
