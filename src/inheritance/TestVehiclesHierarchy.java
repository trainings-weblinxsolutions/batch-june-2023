package inheritance;

public class TestVehiclesHierarchy {
	public static void main(String[] args) {
        MountainBike mb = new MountainBike();
        mb.numberOfWheels = 2;
        mb.registrationNumber = "APXX WWW";
        mb.hasHelmet = true;
        mb.maxElevation = 3000.0;
        
        System.out.print("Mountain Bike with registration Number " + mb.registrationNumber);
        System.out.println(" is supported till the elevation of " + mb.maxElevation + " feet.");    

	}

}
class Vehicle
{
    int numberOfWheels;
}
class RegisteredVehicle extends Vehicle
{
    String registrationNumber;
}
class Bike extends RegisteredVehicle // LINE A
{
    boolean hasHelmet;
}
class MountainBike extends Bike
{
    double maxElevation;
    //total attributes in MountainBike class - 4
}
class Car extends RegisteredVehicle
{
    boolean hasAC;
}
class Cycle extends Vehicle
{
    boolean hasBackSeat;
}

