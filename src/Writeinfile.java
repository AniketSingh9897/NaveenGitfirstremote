import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writeinfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fr=new FileWriter("C:\\Users\\aniket.singh\\Desktop\\s.txt");
BufferedWriter bw=new BufferedWriter(fr);
bw.write("selinium with java");
bw.write("selinium");
bw.write("india");

System.out.println("end");
bw.close();

	}


}
