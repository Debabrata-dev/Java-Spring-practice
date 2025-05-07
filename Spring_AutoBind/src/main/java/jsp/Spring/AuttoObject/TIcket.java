package jsp.Spring.AuttoObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class TIcket {
	@Autowired
public void ticketBooked() {
	System.out.println("TIcket Booking");
}
}
