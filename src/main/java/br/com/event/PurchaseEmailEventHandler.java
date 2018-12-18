package br.com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PurchaseEmailEventHandler implements ApplicationListener<CustomEvent> {
	   public void onApplicationEvent(CustomEvent event) {
		   System.out.println("Enviando email de nova compra "+event.getTimestamp() + " "+event.getName());
	   }
	}
