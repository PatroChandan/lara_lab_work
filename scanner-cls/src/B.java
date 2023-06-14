import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Please eneter your complete name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome: "+name);
	}
}
