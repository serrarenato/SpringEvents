package br.com.event.subscriber;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.event.model.event.CustomEvent;

@Component
public class LogEventHandler implements ApplicationListener<CustomEvent> {
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("Gravando no log " + event.getTimestamp() + " " + event.getName());		
	}
}
