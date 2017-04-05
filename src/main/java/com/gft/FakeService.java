package com.gft;

import java.util.Random;

import rx.Observable;
import rx.subjects.PublishSubject;

public class FakeService implements Runnable {

	private Random random;
	private PublishSubject<String> publisher;

	public FakeService() {
		this.random = new Random();
		this.publisher = PublishSubject.create();
	}

	public void run() {
		while (true) {
			try {
				doSomething();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void doSomething() {
		int randomInt = random.nextInt(100);

		System.out.println("Generated number: " + randomInt);

		publisher.onNext(Integer.toString(randomInt));
	}

	public Observable<String> getObservable() {
		return publisher;
	}

}
