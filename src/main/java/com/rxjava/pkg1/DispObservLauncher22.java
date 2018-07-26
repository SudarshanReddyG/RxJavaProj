package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DispObservLauncher22 {
	
	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("One", "Two", "Three", "Four", "Five");
		
		Observer<String> observer = new Observer<String>() {
			
			private Disposable disposable;

			@Override
			public void onSubscribe(Disposable d) {
				this.disposable = d;
			}

			@Override
			public void onNext(String t) {
				System.out.println("The value is "+t);
			}

			@Override
			public void onError(Throwable e) {
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				System.out.println("Activity Completed!!!");
				System.out.println("Disposing the resources");
				disposable.dispose();
			}
		};
		
		observable.subscribe(observer);
	}

}
