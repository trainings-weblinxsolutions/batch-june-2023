package abstract_classes;

public class CalculateAreas {
public static void main(String[] args) {
	
	Shape shapes[] = new Shape[5];
	
	Shape s1;
	//Shape s2 = new Shape(); // we cannot create an object of the abstract class
	
	
	shapes[0] = new Triangle(10, 20);
	shapes[1] = new Rectangle(13, 16);
	shapes[2] = new Circle(7);
	shapes[3] = new Triangle(15, 29);
	shapes[4] = new Rectangle(2, 8);
	
	Shape largest = shapes[0];
	
	for(int i=0;i<shapes.length;i++) {
		
		
		if(shapes[i].getArea() > largest.getArea()) {
			largest = shapes[i];
		}
		
	}
	
	largest.printDetails();
	
	
	
	
	
	
	
	/*
	Rectangle rect = new Rectangle(5.25, 4.0);
	
    System.out.println("Area of rectangle is " + rect.getArea());
    
    
    Circle circle = new Circle(7.5);
    System.out.println("Area of circle is " + circle.getArea());    

*/
	
}
}



abstract class Shape
{
    abstract double getArea(); // LINE A -- this is an abstract method which should not have any method definition
    
    abstract void printDetails();
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


	void printDetails() {
        System.out.println("Type = Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + getArea());
		
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

	@Override
	void printDetails() {
        System.out.println("Type = Circle");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + getArea());

		
	}
	
}
class Triangle extends Shape
{
    double base;
    double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    double getArea()
    {
        return base * height / 2.0;
    }

    void printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
    }
}




