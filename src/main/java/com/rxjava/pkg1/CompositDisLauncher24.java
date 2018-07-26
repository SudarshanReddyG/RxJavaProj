package com.rxjava.pkg1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class CompositDisLauncher24 {
	
	public static void main(String[] args) {
		
		Observable<Long> observable1 = Observable.interval(1, TimeUnit.SECONDS);
		
		Observable<Long> observable2 = Observable.interval(1, TimeUnit.SECONDS);
		
		CompositeDisposable compositeDisposable = new CompositeDisposable();
		
		Disposable disposable1 = observable1.subscribe(num -> System.out.println("Received from Observer1 "+num));
		
		Disposable disposable2 = observable2.subscribe(num -> System.out.println("Received from Observer2 "+num));
		
		compositeDisposable.addAll(disposable1, disposable2);
		
		sleep(5000l);
		
		compositeDisposable.dispose();
		
		sleep(5000l);
	}
	
	private static void sleep(long num) {
		try {
			Thread.sleep(num);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
