package jsp.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pessanger {
    @Autowired
	Ticket ticket;
    public void travle() {
	ticket.BookTicket();
    }
}
