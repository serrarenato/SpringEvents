package br.com.event;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;



@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableAsync
public class App {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(App.class)
				.headless(false).run(args);

		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

		cvp.publish();
		cvp.publish();
		cvp.publish2();
	}
}
