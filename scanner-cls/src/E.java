import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("Please eneter one byte value:");
		Scanner sc = new Scanner(System.in);
		byte value = sc.nextByte();
		System.out.println("Byte value is: "+value);
	}
}