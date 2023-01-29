package observer;

public class Client implements Observer {

	String name;
	String car;
	String service;
	String date;

	Subject cs = new CarService();

	public Client(String name, String car, String service, String date) {
		super();
		this.name = name;
		this.car = car;
		this.service = service;
		this.date = date;
	}

	@Override
	public void reminder() {
		System.out.println("Dear " + name + ". We remind you " + service + " in your car: " + car + "."+
				"\nWe invite you to our car service to set a date this "+ date +".");

	}

	@Override
	public boolean addService(Subject s) {
		cs = s;
		return true;
	}
}
