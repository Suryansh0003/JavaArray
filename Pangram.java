package pwnew;

public class Pangram {

	public static void main(String[] args) {
		int [][]a=new int [][] {
			{23,24,55},
			{93,94},
			{83,84}
		};
//		a[0][0]=23;
//		a[0][1]=24;
//		
//		a[1][0]=13;
//		a[1][1]=14;
//		
//		a[2][0]=34;
//		a[2][1]=54;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}
