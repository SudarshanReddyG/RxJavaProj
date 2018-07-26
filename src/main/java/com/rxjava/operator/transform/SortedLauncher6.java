package com.rxjava.operator.transform;

import java.util.Comparator;

import io.reactivex.Observable;

public class SortedLauncher6 {
	
	public static void main(String[] args) {
		
		Observable<Integer> observable1 = Observable.just(1, 4, 3, 2, 7, 6, 5);
		
		System.out.println("Increasing Order :: ");
		
		observable1.sorted().subscribe(System.out::println);
		
		System.out.println("Reverse Order :: ");
		
		observable1.sorted(Comparator.reverseOrder()).subscribe(System.out::println);
		
		System.out.println("Order of strings based on length :: ");
		
		Observable<String> observable2 = Observable.just("Alpha", "Beta", "Gamma" ,"Delta", "Epsilon");
		
		observable2.sorted((str1, str2) -> Integer.compare(str1.length(), str2.length())).subscribe(System.out::println);
	}

}
