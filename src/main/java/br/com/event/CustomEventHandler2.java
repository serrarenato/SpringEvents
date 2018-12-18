package br.com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventHandler2 implements ApplicationListener<CustomEvent2> {
	   public void onApplicationEvent(CustomEvent2 event) {
	      System.out.println(event);
	   }
	}
