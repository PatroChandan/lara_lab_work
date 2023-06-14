class J 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2() 
	{
		J abj = new J();
		obj.test1();//by using obj reference we are accessing non-static test1;
		System.out.println("from test2");
	}
}
//non-static test1 method is loading while creating object to J class in the test2 static method.