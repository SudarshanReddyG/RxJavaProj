package com.rxjava.operator.supress;

import io.reactivex.Observable;

public class ElementAtLauncher5 {
	
	public static void main(String[] args) {
		
		Observable<String> observable1 = Observable.just("one", "two", "three", "four", "five");
		
		observable1.elementAt(3).subscribe(num -> System.out.println("The value of emmision is "+num), Throwable::printStackTrace);
	}

}
