package jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
BeanFactory b1=new ClassPathXmlApplicationContext("MyConfig.xml");
Demo d1=b1.getBean("MyDemo", Demo.class);
System.out.println(d1.age);
	}

}
