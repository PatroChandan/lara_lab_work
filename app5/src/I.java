class I 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(130));
		System.out.println(Integer.toBinaryString(510));
		System.out.println(130 | 510);
		System.out.println(130 & 510);
		System.out.println(130 ^ 510);
		System.out.println(130 << 1);
		System.out.println(130 << 2);
		System.out.println(130 >> 1);
		System.out.println(130 >> 2);
	}
}

/*
Binary value of 130     :  010000010
Binary value of 510     :  111111110
---------------------------------
bitwise or ( | )        :  111111110  ==> 510

Binary value of 130     :  010000010
Binary value of 510     :  111111110
---------------------------------
bitwise and ( & )       :  010000010  ==> 130

Binary value of 130     :  010000010
Binary value of 510     :  111111110
---------------------------------
bitwise xor ( ^ )       :  101111100  ==> 380

Binary value of 130     :  010000010
left shift by 1 (<< 1)  :  100000100  ==> 260

Binary value of 130     :  010000010
left shift by 2 (<< 2)  :  1000001000  ==> 520

Binary value of 130     :  010000010
right shift by 1 (>> 1) :  001000001  ==> 65

Binary value of 130     :  010000010
right shift by 2 (>> 2) :  000100000  ==> 32

*/