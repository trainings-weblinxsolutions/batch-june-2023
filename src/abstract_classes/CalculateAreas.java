package abstract_classes;

public class CalculateAreas {
public static void main(String[] args) {
	
	
	Rectangle rect = new Rectangle(5.25, 4.0);
	
    System.out.println("Area of rectangle is " + rect.getArea());
    
    
    Circle circle = new Circle(7.5);
    System.out.println("Area of circle is " + circle.getArea());    


	
}
}


abstract class Shape
{
    abstract double getArea(); // LINE A -- this is an abstract method which should not have any method definition
}

class Rectangle extends Shape
{
    double length;
    double breadth;
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }


	double getArea() {
		
        return length * breadth;
	}
}

class Circle extends Shape{

	double radius;
	

    Circle(double radius)
    {
        this.radius = radius;
    }

	double getArea() {
		
		
        return 3.14 * radius * radius;
	}
	
}



