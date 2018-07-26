package com.rxjava.pkg1;

import io.reactivex.Completable;

public class CompletableLauncher20 {
	
	public static void main(String[] args) {
		
		Completable.complete().subscribe(()-> System.out.println("Completed!!!"));
		
		Completable.fromRunnable(()->runProcess()).subscribe(()->System.out.println("Work Completed"), Throwable::printStackTrace);
		
	}
	
	public static void runProcess() {
		try {
			Thread.sleep(5000);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }

}
