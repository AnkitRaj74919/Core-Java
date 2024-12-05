package Shape_project;

public class Triangle extends TwoDShape {
     
	 double a;
	 double b;
	 double c;
	 double h;
	 
	 Triangle(double a,double b,double c,double h)
	 {
		 this.a=a;
		 this.b=b;
		 this.c=c;
		 this.h=h;
	 }
	 
	 public void getArea()
	 {
	  double s=(a+b+c)/2;
	  double area=Math.sqrt(s*(s-a)*(s-b)+(s-c));
	  System.out.println("Area of Triangle is: "+area+"sq unit");
	 }

	 public void getPerimeter()
	 {
	 System.out.println("Perimeter of Triangle: "+(a+b+c)+"Unit");
	 }
     
	 public void rotate()
	 {
		 System.out.println("Rotate the Triangle");
	 }
}
