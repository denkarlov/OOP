package auto;

public class Auto {
	
	private String model;
	private int radius;
	private int width;
	private int height;

	// Constructor
	public Auto(String model,int radius,int width,int height){
		
		this.model = model;
		this.radius = radius;
		this.width = width;
		this.height = height;
	}
	
	// Method gets information about of current type tire 
	public String getModel(){
		return model;
		
	}
	public int getRadius(){
		return radius;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
}
