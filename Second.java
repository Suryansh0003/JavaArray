package pwnew;

class calc{
	public int add(int nums[]) {
		int result=0;
		for(int e:nums)
		result=result+e;
		return result;
	}
}

class Second{
	public static void main(String[] args) {
		calc calc= new calc();
		int nums[]= {5,5,5,5,5};
		System.out.println(calc.add(nums));
	}
}
