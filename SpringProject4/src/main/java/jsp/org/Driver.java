package jsp.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
	BeanFactory b1=new ClassPathXmlApplicationContext("MyConfig.xml");
	Shop shop=b1.getBean("MyShop",Shop.class);
	System.out.println(shop.getName());
	}

}
