
public class Dservice extends Dog{
	private int service, price;
	private String name;
	
	public Dservice(int tp, int sc) {
		super(tp);
		service = sc;
	}
	
	public void set_service(int sc) {
		 service = sc;
	}
	
	public int get_service() {
		return service;
	}
	
	public String get_name() {
		if (service==1){
			name = "Grooming";
		}
		else if (service==2){
			name = "Vet";
		}
		else {
			name = "Breed";
		}
		return name;
	}
	
	public int get_price() {
		if (service==1){
			price = 50;
		}
		else if (service==2){
			price = 30;
		}
		else {
			price = 10;
		}
		return price;
	}
}
