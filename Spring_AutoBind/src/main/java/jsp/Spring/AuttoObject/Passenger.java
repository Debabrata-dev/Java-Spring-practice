
package jsp.Spring.AuttoObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passenger {
	@Autowired
TIcket ticket;
	
	public void travel() {
		ticket.ticketBooked();
		System.out.println("Passenger is travell");
	}
}
