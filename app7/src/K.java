class K 
{
	public static void main(String[] args) 
	{
		char  i = 'a';
		int val = 33;
		char ch = (char)val;
		System.out.println(val);
		System.out.println(ch);

		switch(i)
		{
			case 97:
				System.out.println("from case 'a'");
				break;
			case 'b':
				System.out.println("from case 'b'");
				break;
			case 'c':
				System.out.println("from case 'c'");
				break;
		}
		System.out.println("main end");
	}
}
