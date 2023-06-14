package pack1;
class A 
{
	private int i;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
//access speifiers == access modifiers
//we can have control over the data,which one should be shared and which one should be over package structure
//the access specifiers in java maintains the accessibility or scope of a field,method,constructor,or class,or interface
//private || default || protected || public
//default == package level access specifier == friendly specifier
//private members can be access within class only
//the scope of private member is within the declared class.
//private members cant accessed outside of the class.