
public class occurenceofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java is a programming language";
int totalcount=str.length();
int countafater=str.replace("a","").length();
int a_no=totalcount-countafater;
System.out.println("no ofa"+a_no);

	}

}
