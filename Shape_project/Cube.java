package Shape_project;

public class Cube  extends ThreeDShape{
    
double s;

Cube(double s)
{
	this.s=s;
}
	
	public void getVolume()
	{
		System.out.println("Volume of Cube is:"+s*s*s);
	}
	
	public void getTSA()
	{
		System.out.println("Total Surface Area:"+6*s*s);
	}
	
	public void getLSA()
	{
         System.out.println("Lateral Surface Area:"+4*s*s);
	}
	
	public void rotate()
	 {
		 System.out.println("Rotate the Cube");
	 }
}
