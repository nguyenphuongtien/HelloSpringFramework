package org.o7planning.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
	@Autowired
	private MyRepository repo;
	
	public void showAppInfo() {
		System.out.println("Now is: " + repo.getSystemDateTime());
		System.out.println("App Name: " + repo.getAppName());
	}

}
