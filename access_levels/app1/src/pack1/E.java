package pack1;
public class D
{
	private void test()
	{
		System.out.println("from test()");
	}
}//error: class D is public, should be declared in a file named D.java
public class E 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();// error: test() has private access in D d1.test();
		System.out.println("done");
	}
}
//in one java file any number classes can be developed.
//for all the classes a .class will be generated Ex A.class,B.class,C.class
