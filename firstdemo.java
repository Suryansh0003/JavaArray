package pwnew;



public class firstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(j==(n-1)/2&&i>0&&i<=(n-1)/4||i==0&&j<=(n-1)/3||j==0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)/2||j==(n-1)&&i>(n-1)/2||j==(n-1)/2&&i<(n-1)&&i>(n-1)/2||i==(n-1)/2&&j>(n-1)/2) {
			System.out.print("#");
		}
		
		else {
			System.out.print(" ");
		}
	}
	System.out.println("  ");
}



	}

}
