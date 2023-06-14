class G 
{
	int i;
	public static void main(String[] args) 
	{
		G g1 = new G();//Object creation
		System.out.println(g1.i);//by using the reference of G class object we can access the non static variable i.
		//this g1 reference is local to main method
	}
}
