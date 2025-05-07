package jsp.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext app=new AnnotationConfigApplicationContext(MyConfig.class);
	Pessanger p1=app.getBean("pessanger",Pessanger.class);
	System.out.println(p1);
	p1.travle();
}
}
