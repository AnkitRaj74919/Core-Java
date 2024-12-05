package Shape_project;


public class Square extends TwoDShape{
     
	double side;

	
	Square(double side)
	{
 
		this.side=side;
	}
	
	  public void getArea()
	  {
		  System.out.println("Area of Square is: "+side*side +"Sq Unit");
	  }
	  
	  public void getPerimeter()
	  {
		  System.out.println("Perimeter of Square:"+4*side+"Unit");
	  }
	  public void rotate()
		 {
			 System.out.println("Rotate the Square");
		 }
}
