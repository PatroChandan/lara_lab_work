class V 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("main1: "+i);
		i = 1;
		test();
		System.out.println("main2: "+i);
		i = 2;
		V.test();
		System.out.println("main3: "+i);
	}
	public static void test(){
		System.out.println("test: "+i);
		i += 3;
	}
}
