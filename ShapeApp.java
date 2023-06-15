package pwnew;


import java.util.Scanner;

abstract class Shape {
	abstract public void input();

	abstract public void compute();

final	public void disp() {
		System.out.println("The area is :" + area);
	}

      float area;

}

class rectangle extends Shape {
	float length;
	float breadth;

	@Override
	public void input() {
		System.out.println("Calculation on rectangle class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectantangle ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextFloat();
		

	}

	public void compute() {
		area = length * breadth;
	}
	public void spe() {
		System.out.println("This is speclized method");
	}
	
}

class square extends Shape {
	float length;

	@Override
	public void input() {
		System.out.println("calculation of square class");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of square");
		length = scanner.nextFloat();

	}

	@Override
	public void compute() {
		area = length * length;

	}
}
class circle extends Shape{
	float radious;
	@Override
	public void input() {
		System.out.println("Calcultion of circle class");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radious");
		radious=scanner.nextFloat();
		
	}
	@Override
	public void compute() {
	
		area=3.14f*radious*radious;
	}
}
class poly{
	public void exe(Shape sh) {
		sh.input();
		sh.compute();
		sh.disp();
		
	}
	
}

public class ShapeApp {
	public static void main(String[] args) {

		rectangle rt =new rectangle();
		square se=new square();
		circle cc=new circle();
		
		
		poly pp = new poly();
		pp.exe(rt);
		pp.exe(se);
		pp.exe(cc);
		
	}

}
