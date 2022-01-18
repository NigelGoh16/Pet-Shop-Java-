package Joen;

public class Product {
	private double Food, Bowl, Fetch, Toy;
	
	public Product(double F, double B, double f, double T) {
		Food = F;
		Bowl = B;
		Fetch = f;
		Toy = T;
	}
	
	public double getFood() {
		return Food;
	}
	
	public double getBowl() {
		return Bowl;
	}
	
	public double getFetch() {
		return Fetch;
	}
	
	public double getToy() {
		return Toy;
	}
}