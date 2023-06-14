class  J
{
	public static void main(String[] args) 
	{
		int a = 60,b = 20,c = 90,d = 10,e = 50,f = 40,g = 70,h = 80,i = 30,j = 100;
		int min = (a < b && a < c && a < d && a < e && a < f && a < g && a < h && a < i && a < j)? a :
			(b < a && b < c && b < d && b < e && b < f && b < g && b < h && b < i && b < j)? b :
			(c < b && c < a && c < d && c < e && c < f && c < g && c < h && c < i && c < j)? c :
			(d < b && d < c && d < a && d < e && d < f && d < g && d < h && d < i && d < j)? d :
			(e < b && e < c && e < d && e < a && e < f && e < g && e < h && e < i && e < j)? e :
			(f < b && f < c && f < d && f < e && f < a && f < g && f < h && f < i && f < j)? f :
			(g < b && g < c && g < d && a < e && a < f && a < g && a < h && a < i && a < j)? g :
			(h < b && h < c && h < d && h < e && h < f && h < g && h < a && h < i && h < j)? h :
			(i < b && i < c && i < d && i < e && i < f && i < g && i < h && i < a && i < j)? i : j;
		System.out.println(min);
	}
}
