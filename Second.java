package pwnew;


class Calc{
	public int addArray(int myArray[]) {
		int c=0;
		for(int e:myArray) {
			c=c+e;
		}
		return c;

			
			
			
		
	}
}
class Second{
public static void main(String[] args) {
	
	Calc c = new Calc();
	int myArray[]= {5,5,6,4,3,3};
	System.out.println(c.addArray(myArray));
	
}
}