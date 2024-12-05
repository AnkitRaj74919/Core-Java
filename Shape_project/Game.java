package Shape_project;

import java.util.Scanner;
public class Game {
	
	Game(){
		System.out.println("=========New Game has Started=========");
	}

	public Shape selectShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for 2DShape:");
		System.out.println("Press 2 for 3DShape:");
		int choice=sc.nextInt();
		sc.close();
		if(choice==1)
		{
			System.out.println("You have selected 2DShape:");
			System.out.println("Press 1 for Circle:");
			System.out.println("Press 2 for Rectangle:");
			System.out.println("Press 3 for Triangle:");
			System.out.println("Press 4 for Sqaure:");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("You have selected Circle");
				System.out.println("Enter the value of Radius");
		    	double d1=sc.nextDouble();
				Circle circle=new Circle(d1);
				circle.getArea();
				circle.getPerimeter();
				return circle;
			}
			else if(select==2)
			{
				System.out.println("You have selected Rectangle");
				System.out.println("Enter the value of length");
				System.out.println("Enter the value of Width");
		    	double l=sc.nextDouble();
		    	double w=sc.nextDouble();
		    	
				Rectangle rectangle=new Rectangle(l,w);
				rectangle.getArea();
				rectangle.getPerimeter();
				return rectangle;
				
			}
			else if(select==3)
			{
				System.out.println("You have selected Triangle");
				System.out.println("Enter the value of 1st side");
				System.out.println("Enter the value of 2nd side");
				System.out.println("Enter the value of 3rd side");
				System.out.println("Enter the value of Hieght");
		    	double d1=sc.nextDouble();
		    	double d2=sc.nextDouble();
		    	double d3=sc.nextDouble();
		    	double d4=sc.nextDouble();
				Triangle triangle=new Triangle(d1,d2,d3,d4);
				triangle.getArea();
				triangle.getPerimeter();
				return triangle;
			}
			else if(select==4)
			{
				System.out.println("You have selected Square");
     			System.out.println("Enter the value of side");
		    	double d=sc.nextDouble();
				Square square=new Square(d);
				square.getArea();
				square.getPerimeter();
				return square;
				
				
			}
			else
			{
				System.out.println("You have choosen invalid choice");
			}
			return selectShape();
			
		}
		else if(choice==2)
		{
			System.out.println("You have selcted 3DShape:");
			System.out.println("Press 1 for Cylinder:");
			System.out.println("Press 2 for Sphere:");
			System.out.println("Press 3 for Cube:");
			System.out.println("Press 4 for Cone:");
			int chose=sc.nextInt();
			if(chose==1)
			{
				System.out.println("You have selected Cylinder");
				System.out.println("Enter the value of Radius");
				System.out.println("Enter the value of Hieght");
				double d1=sc.nextDouble();
				double d2=sc.nextDouble();
				Cylinder cylinder=new Cylinder(d1,d2);
				cylinder.getCSA();
				cylinder.getTSA();
				cylinder.getVolume();
				return cylinder;
			}
			else if(chose==2)
			{
				System.out.println("You have selected Sphere");
				System.out.println("Enter the value of Radius");
				double d1=sc.nextDouble();
				
				Sphere sphere=new Sphere(d1);
				sphere.getVolume();
				sphere.getSa();
				return sphere;
			}
			else if(chose==3)
			{
				System.out.println("You have selected Cube");
				System.out.println("Enter the value of Side");
				
				double d1=sc.nextDouble();
				
				Cube cube=new Cube(d1);
				cube.getLSA();
				cube.getTSA();
				cube.getVolume();
				return cube;
			}
			else if(chose==4)
			{
				System.out.println("You have selected Cone");
				System.out.println("Enter the value of Radius");
				System.out.println("Enter the value of Hieght");
				System.out.println("Enter the value of Latent Hieght");
				double d1=sc.nextDouble();
				double d2=sc.nextDouble();
				double d3=sc.nextDouble();
				Cone cone=new Cone(d1,d2,d3);
				cone.getCSA();
				cone.getTSA();
				cone.getVolume();
				return cone;
			}
			else
			{
				System.out.println("You have choosen invalid choice");
			}
			return selectShape();
			
		}
		else
		{
			System.out.println("You have choosen invalid choice");
		}
		return selectShape();
	}
}