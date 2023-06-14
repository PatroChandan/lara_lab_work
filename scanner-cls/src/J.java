import java.util.Scanner;
class J
{
	public static void main(String[] args) 
	{
		System.out.println("Please eneter rollno:");
		Scanner sc = new Scanner(System.in);
		int rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Please eneter name:");
		String name = sc.nextLine();
		System.out.println("Please eneter initials:");
		char initials = sc.next().charAt(0);
		System.out.println("Please eneter age:");
		int age = sc.nextInt();
		System.out.println("Please eneter course:");
		String course = sc.next();
		sc.nextLine();
		System.out.println("Please eneter skills:");
		String skills = sc.nextLine();
		System.out.println("Please eneter fees:");
		double fees = sc.nextDouble();
		System.out.println("Please eneter joboffer:");
		boolean joboffer = sc.nextBoolean();
		System.out.println("-----------------------------");
		System.out.println("rollno: "+rollno);
		System.out.println("name: "+name);
		System.out.println("initials: "+initials);
		System.out.println("age: "+age);
		System.out.println("course: "+course);
		System.out.println("skills: "+skills);
		System.out.println("fees: "+fees);
		System.out.println("joboffer: "+joboffer);
	}
}
