class P
{
	public static void main(String[] args) 
	{
		String i = "abc";
		switch(i = "3")
		{
			default:
				System.out.println("from default 1");
				break;
			case "1":
				System.out.println("from case 1");
				break;
			case "2":
				System.out.println("from case 2");
				break;
			case "3":
				System.out.println("from case 3");
				break;
			default:
				System.out.println("from default 2");//only one default is allowed 
				break;

		}
	}
}