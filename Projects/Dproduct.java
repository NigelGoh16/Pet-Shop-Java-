
public class Dproduct{
	private int product, price;
	private String name;
	
	public Dproduct() {
	}
	
	public void set_product(int pt) {
		 product = pt;
	}
	
	public int get_product() {
		return product;
	}
	
	public String get_name() {
		if (product==1){
			name = "Food";
		}
		else if (product==2){
			name = "Bowl";
		}
		else {
			name = "Fetch";
		}
		return name;
	}
	
	public int get_price() {
		if (product==1){
			price = 15;
		}
		else if (product==2){
			price = 20;
		}
		else {
			price = 10;
		}
		return price;
	}
}
