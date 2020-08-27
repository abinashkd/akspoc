package io.aks.poc.hello;

public class Greetings {
	
	private String greetings;

public String getGreeting() {
	return greetings;
}

public void getGreeting(String name) {
	this.greetings = name;
}

public Greetings() {
}

public Greetings(String name) {
	super();
	this.greetings = name;
}

}
