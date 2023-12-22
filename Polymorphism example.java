abstract class Shape{
    abstract void Sides();
}
class Triangle extends Shape{
    void Sides(){
        System.out.println("A triangle has 3 sides");
    }
}
class Rectangle extends Shape{
    void Sides(){
        System.out.println("A rectangle has 4 sides");
    }
}
class Hexagon extends Shape{
    void Sides(){
        System.out.println("A hexagon has 6 sides");
    }
}

public class Main
{
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape rect = new Rectangle();
		Shape hex = new Hexagon();
		
		tri.Sides();
		rect.Sides();
		hex.Sides();
	}
}
