package jsp.Spring;

public class Car {
private Enginee enginee;

public Enginee getEnginee() {
	return enginee;
}

public void setEnginee(Enginee enginee) {
	this.enginee = enginee;
}
public void start() {
	enginee.runs();
	System.out.println("Car is start");
}
}
