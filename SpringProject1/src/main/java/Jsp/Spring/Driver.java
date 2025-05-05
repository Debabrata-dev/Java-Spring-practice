package Jsp.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
BeanFactory f=new ClassPathXmlApplicationContext("MyConfig.xml");
Student s1=f.getBean("MyStudent",Student.class);
System.out.println(s1);
	}

}
