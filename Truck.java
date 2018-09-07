package parkingLot;

public class Truck extends Vehicle{
	 
private int Containers;
 
public Truck(){
super();
}
 
public Truck(String model, String color, int numOfWheels, String transmission, int numOfContainers){
super ( model, color, numOfWheels, transmission) ;
Containers = numOfContainers;
}
 
//getters
 
public int getnumOfContainers(){
return Containers;
}
 
//setter
public void setnumOfContainers(){
this.Containers = getnumOfContainers();
}
 
//Method
public void printTruckdetails(){
super.VehicleDiscribtion();
System.out.println(" Number of Containers in this Truck are: " + Containers);
 
}
}