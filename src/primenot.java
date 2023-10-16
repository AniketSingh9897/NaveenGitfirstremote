
public class primenot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int count=0;
		if(n>1)
		{
			for(int i=1;i<=n/2;i++)
			{
			if(n%i==0)
			{
				count++;
			}
			}
			if(count==2)
			{
				System.out.println("no is prime");
			}
			else
			{
				
				System.out.println("no is not prime");
			}
			}
			
		else
		{
			
			System.out.println("not a prime no");
		}

	}

}
