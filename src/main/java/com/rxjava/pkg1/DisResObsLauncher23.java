package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.observers.ResourceObserver;

public class DisResObsLauncher23 {
	
	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("One", "Two", "Three", "Four", "Five");
		
		ResourceObserver<String> resourceObserver = new ResourceObserver<String>() {
			
			@Override
			public void onNext(String t) {
				System.out.println("Received :: "+t);
			}
			
			@Override
			public void onError(Throwable e) {
				e.printStackTrace();
			}
			
			@Override
			public void onComplete() {
				System.out.println("Completed!!!");
			}
		};
		
		ResourceObserver<String> disposable = observable.subscribeWith(resourceObserver);
		
	}

}
