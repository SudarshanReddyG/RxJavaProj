package com.rxjava.operator.transform;

import io.reactivex.Observable;

public class CastLauncher2 {
	
	public static void main(String[] args) {
		Observable<String> strObservable = Observable.just("Alpha", "Beta", "Gamma");
		
		Observable<Object> observableObj1 = strObservable.map(str -> (Object) str);
		
		Observable<Object> observableObj2 = strObservable.cast(Object.class);
	}

}
