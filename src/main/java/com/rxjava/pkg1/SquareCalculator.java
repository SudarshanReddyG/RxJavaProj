package com.rxjava.pkg1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
	
	private ExecutorService executor = Executors.newSingleThreadExecutor();
	
	public Future<Integer> calculate(int number) {
		return executor.submit(() -> {
			Thread.sleep(5000);
			return number*number;
		});
	}

}
