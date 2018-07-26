package com.rxjava.pkg1;

import java.util.concurrent.Future;

import io.reactivex.Observable;

public class FutureLauncher12 {
	
	private static final int NUMBER = 10; 
	
	public static void main(String[] args) {
		
		SquareCalculator squareCalculator = new SquareCalculator();
		Future<Integer> result = squareCalculator.calculate(NUMBER);
		
		Observable.fromFuture(result).subscribe(num -> System.out.println("The square of "+NUMBER+" is "+num));
		
	}

}
