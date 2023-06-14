import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Please eneter one double value:");
		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		System.out.println("Double value is: "+value);
	}
}
//byte < short < int < long < float < double