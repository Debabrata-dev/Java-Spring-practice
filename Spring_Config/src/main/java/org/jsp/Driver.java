package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(MyConfig.class);
		Employee e1=(Employee) app.getBean("employee");
		e1.display();

	}

}
