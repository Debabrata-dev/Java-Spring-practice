package jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
ApplicationContext app=new AnnotationConfigApplicationContext(MyConfig.class);
Person p1=app.getBean("person",Person.class);
System.out.println(p1);
p1.use();
	}

}
