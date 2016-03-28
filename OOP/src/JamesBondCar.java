
public class JamesBondCar extends Car {
	int currentSubmergeDepth;
	boolean isGunOnBoard = true;
	final String MANUFACTURER = "BMW";
	
	void submerge(){
		currentSubmergeDepth = 50;
	}
	
	void surface(){}
	
}
