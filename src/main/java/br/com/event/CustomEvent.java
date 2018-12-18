package br.com.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
		String name;
	   public CustomEvent(Object source, String name) {
	      super(source);
	      this.name=name;
	   }
	   public String getName() {
		   return this.name;
	   }
	   public String toString(){
	      return "My Custom Event";
	   }
}