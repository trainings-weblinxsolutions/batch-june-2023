package classes_objects;

public class ClassComposition {
public static void main(String[] args) {
	Room hall = new Room("Hall"); 
	
	
    hall.area = 200.0;
    hall.paintColor = "Voilet";
    hall.flooring = "Marble";
    hall.ceilingFan = new Fan("Ceiling Fan");
    hall.ceilingFan.speed = 500;     // LINE B1
    hall.ceilingFan.numberOfSpeeds = 5;
    
    System.out.println("Name of fan : "+hall.ceilingFan.name);
    

    hall.tube = new Light("Hall tube light"); // LINE C
    hall.tube.color = "White";
    hall.tube.watts = 40;
    hall.tube.tube = true;    // LINE C1

	
    Light bl = new Light("Yellow bed light"); // LINE D
    bl.color="Yellow";
    bl.tube=false;
    bl.watts=150;
    hall.bedLight=bl;
    
    
    
    System.out.println("Print color of hall bedlight : "+hall.bedLight.color);
    
    
	
}
}
class Room
{
    String name;
    double area;
    String paintColor;
    String flooring;
    Fan ceilingFan;
    Light tube;
    Light bedLight;

    Room(String name)
    {
        this.name = name;
    }
}











class Fan
{
    String name;
    double speed;
    String color;
    int numberOfSpeeds;

    Fan(String name)
    {
        this.name = name;
    }
}
class Light
{
    String name;
    String color;
    int watts;
    boolean tube;

    Light(String name)
    {
        this.name = name;
    }
}

