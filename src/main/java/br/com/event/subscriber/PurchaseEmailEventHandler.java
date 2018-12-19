package br.com.event.subscriber;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.event.model.event.CustomEvent;

@Component
public class PurchaseEmailEventHandler implements ApplicationListener<CustomEvent> {
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("Enviando email para novo usario " + event.getTimestamp() + " " + event.getName());
		System.out.println("Enviando Email para:" + event.getEmail());
	}
}
