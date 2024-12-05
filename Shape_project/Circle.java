package Shape_project;

public class Circle extends TwoDShape{
         
	 double radius;
	 
	 Circle(double radius)
	 {
		 this.radius=radius;
	 }
	 
	  public void getArea()
	  {
		  System.out.println("Area of Circle is: "+3.14*radius *radius +"Sq Unit");
	  }
	  
	  public void getPerimeter()
	  {
		  System.out.println("Perimeter of Circle:"+2*3.14*radius+ "Unit");
	  }
	  
	  public void rotate()
		 {
			 System.out.println("Rotate the Circle");
		 }
}
