package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
BeanFactory factory=new ClassPathXmlApplicationContext("MyConfig.xml");
Car c=factory.getBean("myCar",Car.class);

c.start();
	}

}
