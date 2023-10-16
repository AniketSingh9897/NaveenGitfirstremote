
public class dupliocate_elemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,2};
boolean xyz=false;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			xyz=true;
			
			
		}
		
		
	}
}

if(xyz==true)
	System.out.println("elemeent found");
else
	System.out.println("not found");
	
	}

}
