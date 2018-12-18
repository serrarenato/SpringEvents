package br.com.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent2 extends ApplicationEvent{
		String name;
	   public CustomEvent2(Object source, String name) {
	      super(source);
	      this.name=name;
	   }
	   public String getName() {
		   return this.name;
	   }
	   public String toString(){
	      return "My Custom Event2";
	   }
}