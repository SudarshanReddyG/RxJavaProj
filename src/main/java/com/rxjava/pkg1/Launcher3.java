package com.rxjava.pkg1;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class Launcher3 {
	
	public static void main(String[] args) {
		List<String> arrayList = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		
		Observable<String> collectionObservable = Observable.fromIterable(arrayList);
		
		collectionObservable.subscribe(s -> System.out.println("Received : "+ s));
	}

}
