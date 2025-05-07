package jsp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Autowired
	Realme realme;

	public void use() {
		realme.ring();
		System.out.println("Use my realme phone");
	}
}
