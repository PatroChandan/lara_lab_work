class M 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++;
		System.out.println(i);//1
		System.out.println(j);//0
		System.out.println("---------------");
		int m = 0;
		m = m++;//Here we are reassigning the variable
		System.out.println(m);//0
	}
}
