import java.util.Arrays;

public class arraysequal {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		/*boolean xyz=Arrays.equals(a1,a2);
		if(xyz==true)
		System.out.println("arrays are equal");
		else 
			System.out.println("arrays are not equal");
*/
		boolean abc=true;
		if (a1.length==a2.length)
		{
			for(int i=0;i<a1.length-1;i++)
			{
				if(a1[i]!=a2[i])
				{
					abc=false;
				}
				
			}
		}
			else
			{
				abc=false;
				
			}
			
			if(abc==true)
				System.out.println("arrays are equal");
			else 
			{
				System.out.println("arrays are not equal");
			}
				
		}
		
		
	}


