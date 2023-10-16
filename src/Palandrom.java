import java.util.Scanner;

public class Palandrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no is");
		int n=sc.nextInt();
		int rev=n;
		int a=0;
		while(n>0)
		{
			
			a=a*10+n%10;
			n=n/10;
			
		}
		if(a==rev)
		{
		System.out.println("no is plaindrom");
		}
		else
			{
			
			System.out.println("no is not palindrome");
			}}

}
