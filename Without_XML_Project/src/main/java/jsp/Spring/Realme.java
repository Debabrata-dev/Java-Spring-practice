package jsp.Spring;

import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile{

	@Override
	public void ring() {
		System.out.println("Mobile is on vibert mode");
		
	}

}
