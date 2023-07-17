package classes_objects;

import inheritance.UsingItInSomeOtherPackage;
import interfaces.Light;


public class UsingLightClass {
public static void main(String[] args) {
	
	Light light = new Light();
	light.computeDistanceFromEToM();
	
	
	inheritance.Light light1 = new inheritance.Light();
	light1.switchOnLight();
	
	UsingItInSomeOtherPackage obj = new UsingItInSomeOtherPackage();
	
}
}
