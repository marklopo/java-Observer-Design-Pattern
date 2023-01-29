package observer;

public class Inforamtion implements Service, Date {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		boolean c = false;
		
		Subject ser = new CarService();
		
		String info = Service.info();
		String date = Date.info();
		
		Client clt1 = new Client("George", "Toyota", info, date);
		Client clt2 = new Client("Eva", "Audi", info, date);
		Client clt3 = new Client("John", "Fiat", info, date);
		
		 a = clt1.addService(ser);
		 b =clt2.addService(ser);
		//boolean c =clt3.addService(ser);
		if(a==true) {
			ser.addClient(clt1);
		}
		if(b==true) {
			ser.addClient(clt2);
		}
		if (c==true) {
		ser.addClient(clt3);
		}		
		
		ser.sendInfoClient();
		
	}

}
