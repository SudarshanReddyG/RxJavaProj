package com.rxjava.operator.supress;

import io.reactivex.Observable;

public class DistinctLauncher4 {
	
	public static void main(String[] args) {
		
		Observable<String> observable1 = Observable.just("one", "two", "three", "one", "three");
		
		observable1.distinct().subscribe(str -> System.out.println("Received Distinct Observer 1 Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		observable1.distinct(String::length).subscribe(str -> System.out.println("Received Distinct Observer 1 Key Selector Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Integer> observable2 = Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1);
		
		observable2.distinctUntilChanged().subscribe(num -> System.out.println("Received Distinct Observer 2 Until changed Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<String> observable3 = Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta");
		
		observable3.distinctUntilChanged(String::length).subscribe(num -> System.out.println("Received Distinct Observer 3 Until changed Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
	}

}
