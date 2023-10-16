import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
public static void main(String[] args) throws IOException
{//approach 1
/*FileReader fr=new FileReader("C:\\\\Users\\\\aniket.singh\\\\Desktop\\\\s.txt");	
BufferedReader bw=new BufferedReader(fr);
String str;
while((str =bw.readLine())!=null)
{
	System.out.println(str);
	
}
bw.close();
*/
	//approach 2
	/*File f=new File("C:\\Users\\aniket.singh\\Desktop\\s.txt");
	Scanner sc=new Scanner(f);
	while(sc.hasNextLine())
	{
		System.out.println(sc.next());
		
	}
	*/
	// approach 3
	

	File f=new File("C:\\Users\\aniket.singh\\Desktop\\s.txt");
	Scanner sc=new Scanner(f);
	sc.useDelimiter("\\Z");
	System.out.println(sc.next());
	
	
}
}
