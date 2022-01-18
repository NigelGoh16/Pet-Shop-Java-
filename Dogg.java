package Joen;


public class Dogg extends Product{
	private Service dog;
	private double Price;
	
	public Dogg(Service s, double F, double B, double f, double T) {
		super(F,B,f,T);
		dog = s;
	}
	
	public double getGroom() {
		Price = dog.getGroom();
		return Price;
	}
	
	public double getVet() {
		Price = dog.getVet();
		return Price;
	}
	
	public double getBreed() {
		Price = dog.getBreed();
		return Price;
	}
}