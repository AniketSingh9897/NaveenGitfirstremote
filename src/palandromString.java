
public class palandromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitjjin";
		String str1="";
		
	String abc=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
		str1=str1+str.charAt(i);	

		}
if(str1.equals(abc))
{
		System.out.println("string is palindrome");
		
}

else
{
System.out.println("String is not palindrome");	
}
}
}


