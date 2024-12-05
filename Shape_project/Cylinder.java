package Shape_project;

public class Cylinder extends ThreeDShape{
   
	double  h;
	double  r;
	
	Cylinder(double h,double r)
	{
		this.h=h;
		this.r=r;
	}
	 
	public void getVolume()
	{
		System.out.println("Volume of Cylinder is:"+3.14*r*r*h);
	}
	
	public void getTSA()
	{
		System.out.println("Total Surface Area:"+2*3.14*r*(r+h));
	}
	
	public void getCSA()
	{
         System.out.println("Curved Surface Area:"+2*3.14*r*h);
	}
	 public void rotate()
	 {
		 System.out.println("Rotate the Cylinder");
	 }

}
