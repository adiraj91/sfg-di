package org.springframework.sfgdi;

import Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SfgDiApplication.class, args);
		MyController obj=  (MyController) context.getBean("myController");
		obj.ControllerMethod();
	}

}
