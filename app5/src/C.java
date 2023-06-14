class C 
{
	public static void main(String[] args) 
	{
		int i = 200;
		int j = 250;
		String s1 = Integer.toBinaryString(i);
		String s2 = Integer.toBinaryString(j);
		System.out.println(i);
		System.out.println(j);
		System.out.println(s1);
		System.out.println(s2);
	}
}

/*

100 =>1100100
150 =>10010110
200 =>11001000
250 =>11111010

100

	100/2 = 50 + r0
	50/2  = 25 + r0
	25/2  = 12 + r1
	12/2  = 6 + r0
	6/2   = 3 + r0
	3/2   = 1 + r1
	--------------
	100   =   1100100

150

	150/2 = 75 + r0
	75/2  = 37 + r1
	37/2  = 18 + r1
	18/2  = 9 + r0
	9/2   = 4 + r1
	4/2   = 2 + r0
	2/2   = 1 + r0
	---------------
	150   = 10010110

200

	200/2 = 100 + r0
	100/2 = 50 + r0
	50/2  = 25 + r0
	25/2  = 12 + r1
	12/2  = 6 + r0
	6/2   = 3 + r0 
	3/2   = 1 + r1
	--------------
	200   = 11001000

250

	250/2 = 125 + r0
	125/2 = 62 + r1
	62/2  = 31 + r0
	31/2  = 15 + r1
	15/2  = 7 + r1
	7/2   = 3 + r1
	3/2   = 1 + r1
	--------------
	250   = 11111010

*/