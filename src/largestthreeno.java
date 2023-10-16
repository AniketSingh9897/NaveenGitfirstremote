
public class largestthreeno {

	public static void main(String[] args)
	{
int a=10;
int b=15;
int c=45;
/*if ((a>b)&&(a>c))
{
	System.out.println("a is larger");
}
else if((b>a)&&(b>c))
{
	
System.out.println("b is largest");
}
else
{
	System.out.println("c is largest");}


	}*/
int large=a>b ? a:b;
int largest=c>large ? c:large;
System.out.println(largest);


}
}