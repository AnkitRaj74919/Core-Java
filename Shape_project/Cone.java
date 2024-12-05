package Shape_project;

public class Cone extends ThreeDShape{

	double r;
	double h;
	double l=Math.sqrt(r*r+h*h);
	
	Cone(double r,double h,double l)
	{
		this.h=h;
		this.r=r;
		this.l=l;
		
	}
	
	 public void rotate()
	 {
		 System.out.println("Rotate the Cone");
	 }
	 
	 public void getVolume()
		{
			System.out.println("Volume of Cone is:"+3.14*r*l);
		}
		
		public void getTSA()
		{
			System.out.println("Total Surface Area:"+3.14*r*(l+r));
		}
		
		public void getCSA()
		{
	         System.out.println("Curved Surface Area:"+2*3.14*r*h);
		}
}
