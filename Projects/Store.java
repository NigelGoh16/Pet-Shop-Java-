
public class Store {

	public static void main(String[] args) {
		Dog d = new Dog(1);
		Dservice s = new Dservice(1, 2);
		Dproduct p = new Dproduct();
		
		System.out.println(d.get_size()+ s.get_name()+ s.get_price()+ p.get_name()+ p.get_price());
	}

}
