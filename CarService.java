package observer;

import java.util.ArrayList;
import java.util.List;

public class CarService implements Subject {
	
	List<Client> cl = new ArrayList<>();

	@Override
	public void addClient(Client clt) {

		cl.add(clt);

	}

	@Override
	public void cerateInfoClient() {

		for (Observer clt : cl) {

			clt.reminder();
		}

	}

	@Override
	public void sendInfoClient() {
		cerateInfoClient();

	}

}