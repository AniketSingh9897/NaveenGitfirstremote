import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter no");
int n=sc.nextInt();
int rev = 0;
while(n>0)
{
rev=rev*10+n%10;
n=n/10;
}
System.out.println(rev);
}

}
