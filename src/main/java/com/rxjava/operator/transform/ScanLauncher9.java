package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class ScanLauncher9 {
	
	public static void main(String[] args) {
		Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
		
		observable.scan((init, accumulator) -> init + accumulator).subscribe(System.out::println);
	}

}
