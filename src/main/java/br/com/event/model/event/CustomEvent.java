package br.com.event.model.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	String name;
	String email;

	public CustomEvent(Object source, String name, String email) {
		super(source);
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}


	public String toString() {
		return "My Custom Event";
	}
}