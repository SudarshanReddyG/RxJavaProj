package com.rxjava.operator.supress;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class SkipLauncher3 {
	
	public static void main(String[] args) {
		Observable<String> observable1 = Observable.just("One", "Two", "Three", "Four", "Five");
		
		observable1.skip(2).subscribe(str -> System.out.println("Received Skip Observer 1 Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Integer> observable2 = Observable.range(1, 100);
		
		observable2.skipWhile(num -> num <= 60).subscribe(num -> System.out.println("Received Skip Observer 2 Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Long> observable3 = Observable.intervalRange(1, 10, 0, 1, TimeUnit.SECONDS);
		
		observable3.subscribe(num -> System.out.println("Received Observer 3 Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Long> observable4 = Observable.interval(1, TimeUnit.SECONDS);
		
		observable4.skipUntil(observable3).subscribe(num -> System.out.println("Received Skip Observer 4 Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		sleep(20000);
		
	}
	
	private static void sleep(long num) {
		try {
			Thread.sleep(num);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
