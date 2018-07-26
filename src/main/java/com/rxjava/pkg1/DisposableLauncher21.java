package com.rxjava.pkg1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class DisposableLauncher21 {
	
	public static void main(String[] args) {
		Observable<Long> timeObservable = Observable.interval(1, TimeUnit.SECONDS);
		
		Disposable disposable = timeObservable.subscribe(num -> System.out.println("Received "+num));
		
		sleep(5000);
		
		disposable.dispose();
		
		sleep(5000);
	}
	
	public static void sleep(int num) {
		try {
			Thread.sleep(num);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }

}
