package auto;

public class Audi extends Auto implements Inflate{
	
	public Audi(String model, int radius, int width, int height ){
		
		super(model, radius, width, height) ;
		
	}
	
	String model = getModel();
	int radius = getRadius();
	int width = getWidth();
	int height = getHeight();
	
	public boolean inflateTire(double psi){
			
		if(radius == 15 && width == 195 && height == 65 && psi == 2.2){
			
			System.out.println("Model auto: " + model + " type tire: " + width + "/" + height + " R" + radius);
			System.out.println("inflated");
		return true;
	}
		else{
			System.out.println("Model auto: " + model + " type tire: " + width + "/" + height + " R" + radius);
			System.out.println("not inflated");
			return false;
		}

}
}
