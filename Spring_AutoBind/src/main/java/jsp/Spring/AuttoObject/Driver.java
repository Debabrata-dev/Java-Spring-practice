package jsp.Spring.AuttoObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        Passenger p1=context.getBean("passenger",Passenger.class);
        System.out.println(p1);
        p1.travel();

	}

}
