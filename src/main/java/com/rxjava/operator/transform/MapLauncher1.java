package com.rxjava.operator.transform;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class MapLauncher1 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		
		Observable<String> dates = Observable.just("1/3/2016", "5/9/2016", "10/12/2016");
		
		dates.map(date -> LocalDate.parse(date, dateTimeFormatter)).subscribe(date -> System.out.println("New date format is :: "+date));
		
	}

}
