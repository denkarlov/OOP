
public class TestJamesBondCars {

	public static void main(String[] args) {
		JamesBondCar t = new JamesBondCar();
		
		t.color = "military";
		t.numberOfDoors = 2;
		t.currentSubmergeDepth = 20;
		
		
		System.out.println("The JamesBondCar is " + t.color + " and has " + t.numberOfDoors + " doors");
		System.out.println("Current submerge depth: " + t.currentSubmergeDepth + " meters");
		System.out.println("Manufacturer: " + t.MANUFACTURER);
	}
}
