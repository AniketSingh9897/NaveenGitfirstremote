
public class ReverseStringCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ABCD";
char a[]=str.toCharArray();
int len=a.length;
String rev="";
for(int i=len-1;i>=0;i--)
{
	rev=rev+a[i];

}

System.out.println(rev);


	}

}
