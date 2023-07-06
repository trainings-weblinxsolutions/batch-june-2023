package classes_objects;

public class FindRectangleAreaPerimeter {
	
	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle(10, 5);
		System.out.println("Area of r1 is :"+r1.getArea());
		System.out.println("Perimeter of r1 is :"+r1.getPerimeter());
		
		
		Rectangle r2 = new Rectangle(12.87, 3.98);
		System.out.println("Area of r2 is :"+r2.getArea());
		System.out.println("Perimeter of r2 is :"+r2.getPerimeter());
		
		
	}

}
class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }


}