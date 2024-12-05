package Shape_project;

public class Sphere  extends ThreeDShape{
    
	double r;
	
	Sphere(double r)
	{
		this.r=r;
	}
	
	public void getVolume()
	{
		System.out.println("Volume of Cylinder is:"+4*3.14*r*r);
	}
	
	public void getSa()
	{
		System.out.println("Total Surface Area:"+4/3*3.14*r*r*r);
	}
	public void rotate()
	 {
		 System.out.println("Rotate the Sphere");
	 }
	
}
