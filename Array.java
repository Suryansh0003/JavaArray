package pwnew;



class add{
	public int d2(int nums[]) { //Ye perameter mai poora array le rha hai {
	
		int Result =0;//eske andar values add hote jyege
		for(int e:nums) {//enhanced for loop for take one one value on array 
			Result=Result+e;//matlb===  0=0+e
			                          //0+5
									//5+5
		}
		return Result;
	}
}
public class Array{
public static void main(String[] args) {
	add d =new add();
	int nums[]= {5,5,5,75,5,5,5,5,5,5,5,5};
	int Result=d.d2(nums);
	System.out.println(Result);
}
}