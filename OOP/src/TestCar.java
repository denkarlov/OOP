
class TestCar {

	public static void main(String[] args) {
		Car t1 = new Car();
		Car t2 = new Car();
		
		t1.color = "yellow";
		t2.color = "blue";
		t1.numberOfDoors = 4;
		t2.numberOfDoors = 2;
		
		System.out.println("The cars are painted in " + t1.color + " and " + t2.color + " colors");
		System.out.println("The " + t1.color + " car has " + t1.numberOfDoors + " doors and "
				+ t2.color + " car has " + t2.numberOfDoors + " doors" );

	}

}
