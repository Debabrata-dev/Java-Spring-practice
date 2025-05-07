package jsp.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
   @Value(value="1")
	int id;
	@Value("Varun")
	String name;
}
