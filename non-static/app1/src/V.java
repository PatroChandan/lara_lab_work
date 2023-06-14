class V 
{
	int i;
	static V test()//return type can be class type
	{
		return new V();//while returning also we can create the objectr
	}
	public static void main(String[] args) 
	{
		V v1 = test();
		System.out.println(v1.i);
	}
}
//if you find anywhere 'new' then definately it is creation of object only