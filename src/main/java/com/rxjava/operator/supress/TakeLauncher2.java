package com.rxjava.operator.supress;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TakeLauncher2 {
	
	public static void main(String[] args) {
		
		Observable<String> observable1 = Observable.just("One", "Two", "Three", "Four", "Five");
		
		observable1.take(2).subscribe(str -> System.out.println("Received Observer 1 Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		observable1.takeLast(2).subscribe(str -> System.out.println("Received Last Observer 1 Val "+str), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Long> observable2 = Observable.interval(300, TimeUnit.MILLISECONDS);
		
		observable2.take(2, TimeUnit.SECONDS).subscribe(num -> System.out.println("Received Observer 2 Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		sleep(5000);
		
		Observable<Integer> observable3 = Observable.range(1, 100);
		
		observable3.takeWhile(num -> num<50).subscribe(num -> System.out.println("Received Observer 3 take While Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
		Observable<Long> observable4 = Observable.interval(6, 1, TimeUnit.SECONDS);
		
		Observable<Long> observable5 = Observable.interval(1, TimeUnit.SECONDS);
		
		observable5.takeUntil(observable4).subscribe(num -> System.out.println("Received Observer 5 take While Val "+num), Throwable::printStackTrace, () -> System.out.println("Completed!!!"));
		
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
