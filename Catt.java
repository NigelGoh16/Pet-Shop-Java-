package Joen;


public class Catt extends Product{
	private Service cat;
	private double Price;
	
	public Catt(Service s, double F, double B, double f, double T) {
		super(F,B,f,T);
		cat = s;
	}
	
	public double getGroom() {
		Price = cat.getGroom();
		return Price;
	}
	
	public double getVet() {
		Price = cat.getVet();
		return Price;
	}
	
	public double getBreed() {
		Price = cat.getBreed();
		return Price;
	}
}