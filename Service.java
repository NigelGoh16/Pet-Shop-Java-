package Joen;


public class Service {
	private double Groom, Vet, Breed;
	
	public Service(double g, double v, double b) {
		Groom = g;
		Vet = v;
		Breed = b;
	}
	
	public double getGroom() {
		return Groom;
	}
	
	public double getVet() {
		return Vet;
	}
	
	public double getBreed() {
		return Breed;
	}
}