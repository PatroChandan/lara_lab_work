class I 
{
	public static void main(String[] args) 
	{
		int m = 10,n = 2, o = 1;
		int min = (m < n && m < o)? m : (n < m && n < o) ? n : o; //Here I used nested ternary operator
		System.out.println("min value among "+m+", "+n+", "+o+" is "+ min);
		int i = 100,j = 20, k = 150;
		int min2 = (i < j)? i : (j < k) ? j : k; //Here I used nested ternary operator
		System.out.println("min value among "+i+", "+j+", "+k+" is "+ min2);
	}
}
