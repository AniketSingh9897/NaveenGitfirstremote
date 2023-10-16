
public class evenoddindigit {
public static void main(String [] args)
{
int n=123456;
int evencount=0;
int oddcount=0;
while(n>0)
{
	if(n%2==0)
	{
		
		evencount++;
		
	}
	else {
		
		
		oddcount++;
	}
	n=n/10;
}	
	
	System.out.println("no of even no"+evencount);
	System.out.println("no is odd"+oddcount);
	
	
}


}

