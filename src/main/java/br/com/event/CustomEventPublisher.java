package br.com.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component("customEventPublisher")
public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		CustomEvent ce = new CustomEvent(this, "Renato");
		publisher.publishEvent(ce);
	}
	
	public void publish2() {
		CustomEvent2 ce = new CustomEvent2(this, "Evento2");
		publisher.publishEvent(ce);
	}
}