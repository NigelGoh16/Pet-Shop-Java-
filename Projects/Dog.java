
public class Dog {
	private int type;
	private String size;
	
	public Dog(int tp) {
		type = tp;
	}
	
	public void set_dog(int dg){
		type = dg;
	}
	
	public int get_type(){
		return type;
	}
	
	public String get_size() {
		if (type==1){
			size = "Big";
		}
		else if (type==2){
			size = "Medium";
		}
		else {
			size = "Small";
		}
		return size;
	}
}
