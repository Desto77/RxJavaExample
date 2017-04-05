package com.gft;

import java.util.List;

import rx.Observer;

public class MyObserver implements Observer<List<String>> {

	@Override
	public void onCompleted() {
	}

	@Override
	public void onError(Throwable e) {
	}

	@Override
	public void onNext(List<String> list) {
		System.out.println("Received elements:");
		list.forEach(el -> System.out.println(el));
	}

}
