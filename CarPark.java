package parkingLot;
	 
	import java.util.ArrayList;
	 
	public class CarPark {
	 
	private static final int  lotcapcity = 300;
	private ArrayList <Vehicle>VehiclePark; 
	 
	public CarPark(){
	 
	this.VehiclePark = new ArrayList<Vehicle>(lotcapcity);
	//This ensures car PArk has one 300 vehicles max
	 
	}
	 
	// Method to find maximum capacity 
	public static int getMaxCapacity(){
	return lotcapcity;
	}
	 
	// Method to find available spots
	public int numOfAvailableSpots(){
	return lotcapcity -
	VehiclePark.size();
	}
	 
	// Method to find number of occupied spaces
	public int numOfOccupiedSpots(){
	return this.VehiclePark.size();
	}
	 
	//Method to add vehicles 
	public void addVehicles(Vehicle vehicle){
	 
	if(numOfAvailableSpots() > 0){
	VehiclePark.add(vehicle);
	vehicle.VehicleDiscribtion();
	System.out.println("---------------- \n");
	}else {
	System.out.println("Car Park is full");
	}
	 
	}
	//Method to print parked vehicle details
	public void printParkedVehiclediscribtion(){
	 

	for(Vehicle vehicle: VehiclePark){
	vehicle.VehicleDiscribtion();
	System.out.println("++++++++++++++++ \n");
	 
	}
	 
	}
	

}
