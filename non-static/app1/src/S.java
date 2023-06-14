class S 
{
	int i;
	static void test1(int x)//x = s1.i
	{
		System.out.println(x);
		x = 10;
		System.out.println(x);
	}
	static void test2(S s1)//s1(test2) = s1(main)
	{
		s1.i = 20;
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 30;
		System.out.println("A: "+s1.i);
		//call by value/pass by value
		//changes in the test doesnot reflecting back to the source
		test1(s1.i);//primitive
		System.out.println("B: "+s1.i);
		//pass by reference/call by reference
		//changes in the destination reflectimg to the source.
		test2(s1);
		System.out.println("c: "+s1.i);
	}
}
