package Jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("config.xml");
		Student student=factory.getBean("MyStudent",Student.class);
        System.out.println(student);
	}

}
