package pack1;
class Q
{
	private Q()
	{
		System.out.println("Q()");
	}
	Q(int i)
	{
		
	}
}
class R extends Q
{
	R()
	{
		super(1);
	}
	
}
