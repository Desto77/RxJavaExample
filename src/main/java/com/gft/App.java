package com.gft;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	FakeService service = new FakeService();
    	MyObserver observer = new MyObserver();
    	
    	service.getObservable()
    		.buffer(5)
    		.subscribe(observer);
    	
    	ExecutorService executorService = Executors.newSingleThreadExecutor();
    	executorService.execute(service);
    	
    }
}
