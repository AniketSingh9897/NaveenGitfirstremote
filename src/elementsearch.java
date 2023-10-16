
public class elementsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {50,60,70,80,90,100};
int search=80;
boolean xyz=false;
for(int i=0;i<a.length;i++)
{
	if(search==a[i])
	{
		System.out.println("element found "+i+ "postion");
		xyz=true;
		break;
		
	}
}
if(xyz==true)
	System.out.println("elemeent found");
else
	System.out.println("not found");


	}

}
