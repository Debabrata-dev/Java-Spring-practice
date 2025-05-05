package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		BeanFactory f = new ClassPathXmlApplicationContext("Configuration.xml");
		Person p1 = f.getBean("MyPersion", Person.class);
		System.out.println(p1);

	}
}
