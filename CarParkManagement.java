// Parking Lot project 
// Alaa al sudani


package parkingLot;

import java.util.Scanner;

public class CarParkManagement {

	public static void main(String[] args) {
		 
		
		Car car1 = new Car("Z", "red",4, "Auto",false);
		Car car2 = new Car("U", "black",4, "Auto",false);
		Car car3 = new Car("U", "green",4, "Auto",false);
		Car car4 = new Car("U", "white",4, "Auto",false);

		 
		Bike bike1 = new Bike("X", "red",2,true );
		Bike bike2 = new Bike("X", "black",2,true );
		Bike bike3 = new Bike("X", "white",2,true );

		 
		Truck truck1 = new Truck("K", "black", 12,"Manual", 4 );
		Truck truck2 = new Truck("K", "white", 12,"Manual", 4 );
		Truck truck3 = new Truck("K", "red", 12,"Manual", 4 );
		Truck truck4 = new Truck("K", "orange", 12,"Manual", 4 );
		 
		 
		CarPark Park = new CarPark();
		 
	 //Parking Vehicles
     //Park.addVehicles(car1);
		Park.addVehicles(car2);
	//	Park.addVehicles(car3);
	//	Park.addVehicles(car4);
		Park.addVehicles(truck1);
	//	Park.addVehicles(truck2);
	//	Park.addVehicles(truck3);
	//	Park.addVehicles(truck4);
	//	Park.addVehicles(bike1);
		Park.addVehicles(bike2);
	//	Park.addVehicles(bike3);
		

		 
		// Comment some of the above to see if it works
		 
		System.out.println(" number of parked vehicles: " + Park.numOfOccupiedSpots());
		 
		System.out.println(" number of Available parking Spots: "+ Park.numOfAvailableSpots());
		 
		// Printing details
		System.out.println("====================\n");
		System.out.println("List of All Parked Vehicles : ");
		Park.printParkedVehiclediscribtion();
		 
		 		}
		 
		}