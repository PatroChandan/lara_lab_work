import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("Please eneter 1st int value:");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		System.out.println("Please eneter 2nd int value:");
		int value2 = sc.nextInt();
		System.out.println("Please eneter 3rd int value:");
		int value3 = sc.nextInt();
		System.out.println("sum of value is: "+(value1+value2+value3));
	}
}
