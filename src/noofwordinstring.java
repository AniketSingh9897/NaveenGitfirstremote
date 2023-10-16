
public class noofwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="the end is near gghg gfbfbfb ffb";
int len=str.length();
int count=1;
/*for(int i=0;i<len;i++)
	{if(str.charAt(i)==' ')
	{	count++;
	}	}
System.out.println("no of words"+count);
	}*/
for(int i=0;i<len;i++)
{ if ((str.charAt(i)==' ') &&(str.charAt(i+1)!=' '))
		{
	count++;
	
		}
	
}
System.out.println("no of words"+count);



}}
