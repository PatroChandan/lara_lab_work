class C5 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: "+ args.length);
		System.out.println("---------------------");
		//its not converting from string to char
		//its just fetching values from a particular string index
		//we cant convert string to char
		char i = args[0].charAt(0);
		
		System.out.println(i);
		
	}
}
//internally strings are also array of characters, and will be having indexes. index starts from 0.