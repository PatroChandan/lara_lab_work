package pack1;
class H
{
	private int i;
	public void set(int i)
	{
		//this represents current object
		//if the local and global are having the same name, then local one will be given the preference. thats why when you are refering to global variable include 'this'
		this.i = i;//0,90
		this.i = this.i;//0,0
		i = this.i;//0,0
	}
	public int get()
	{
		return i;
	}
}
class I 
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.get());//0
		h1.set(90);
		System.out.println(h1.get());//90
	}
}
