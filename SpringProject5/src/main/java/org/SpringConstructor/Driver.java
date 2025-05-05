package org.SpringConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory f1=new ClassPathXmlApplicationContext("Configuration.xml");
        Employee e1=f1.getBean("MyEmp",Employee.class);
        System.out.println(e1.eid);
        System.out.println(e1.name);
        System.out.println(e1.sal);
	}

}
