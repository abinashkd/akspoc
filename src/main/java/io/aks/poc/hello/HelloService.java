package io.aks.poc.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public Greetings returnName(Name nm) {
		
		System.out.println(nm.getName());
		
		Greetings gs = new Greetings(nm.getName());
		
		return gs;	
	}

}
