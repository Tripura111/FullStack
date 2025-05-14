import java.util.Scanner;

abstract class Shapes
{
	float area;
	
	abstract public void input();
	abstract public float compute();
	public void disp()
	{
		System.out.println("The area is :" + area);
	}
}
class Rectangle extends Shapes
{
	int length;
	int width;

     public void input()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Please enter the length of rectangle");
    	  length = sc.nextInt();
    	  System.out.println("Please enter the width of rectangle");
    	  width = sc.nextInt();
    	 
     }
     public float compute()
     {
    	 area=length *width;
    	 return area;
     }
          
}

class Square extends Shapes
{
	int length;
	
     public void input()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Please enter the length of Square");
    	  length = sc.nextInt();
    	  
     }
     public float compute()
     {
    	 area=length *length;
    	 return area;
     }
          
}

class  Circle extends Shapes
{
	final float pi=3.14f;
	float radius;
     public void input()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Please enter the radius of Circle");
    	  radius = sc.nextFloat();
    	  
    	 
     }
     public float compute()
     {
    	 area=pi*radius*radius;
    	 return area;
     }
          
}
class Geometry
{
	public void permit(Shapes shapes)
	{
		shapes.input();
		shapes.compute();
		shapes.disp();
	}
}

public class AreaInheritAbstactPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		Square squa=new Square();
		Circle circ=new Circle();
		Geometry geo=new Geometry();
		geo.permit(rect);
		geo.permit(squa);
		geo.permit(circ);
		
		
		
		

	}

}
