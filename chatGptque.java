package pwnew;




public class chatGptque {

	public static void main(String[] args) {

//	int[] numbers = {5, 10, 15, 20, 25};
//	int product = 1;
//
//	for (int i = 0; i < numbers.length; i++) {
//	    if (numbers[i] % 5 == 0) {
//	        product *= numbers[i];
//	        
//	    }
//	}
//
//	System.out.println(product);
//	System.out.println(25*10*15*5*20);
//		int[] arr = new int[5];
//		int count = 0;
//		int count2 = 0;
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//
//			Random r = new Random();
//			int ran = r.nextInt(5);
//			System.out.println("Enter marks of " + ran + "st " + " Student");
//			arr[i] = sc.nextInt();
//			count++;
//
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(count2 + "Marks is " + arr[i]);
//			count2++;
//		}
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
		int n = 18;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2 || j == 0 || i == 0 || j == (n - 1) || i == (n - 1)
						|| i == (n - 1) / 2 || i - j >= (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
