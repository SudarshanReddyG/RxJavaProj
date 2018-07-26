package com.rxjava.pkg1;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class DispCreatLauncher {

	public static void main(String[] args) {
		Observable<Integer> source = 
				Observable.create(observableEmitter -> {
					try {
						for (int i = 0; i < 1000; i++) {
							while (!observableEmitter.isDisposed()) {
								System.out.println("Inserting value "+i);
								observableEmitter.onNext(i);
								Thread.sleep(1000);
							} 
							if (observableEmitter.isDisposed()) 
								return;
						}
						observableEmitter.onComplete();
					} catch (Throwable e) {
						observableEmitter.onError(e);
					}
				});
		
		source.subscribe(System.out::println);
		
		/*Disposable disposable = source.subscribe(System.out::println);
		
		sleep(5000);
		
		disposable.dispose();*/
	}
	
	private static void sleep(long num) {
		try {
			Thread.sleep(num);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}

