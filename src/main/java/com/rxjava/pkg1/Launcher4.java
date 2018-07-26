package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Launcher4 {
	
	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		Observer<Integer> observer = new Observer<Integer>() {
			
			@Override
			public void onSubscribe(Disposable d) {
			}
			
			@Override
			public void onNext(Integer t) {
				System.out.println("Received : "+t);
			}
			
			@Override
			public void onError(Throwable e) {
				e.printStackTrace();
			}
			
			@Override
			public void onComplete() {
				System.out.println("Completed!!");
			}
		};
		
		observable.map(String::length).filter(num -> num>=5).subscribe(observer);
	}

}
