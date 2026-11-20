import java.io.File;
import java.io.IOException ;
import java.io.FileReader ;
import java.io.FileWriter ;
public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		File file = new File("MyFolder.txt");
		System.out.println(file.createNewFile());
		FileReader fr = new FileReader(file) ;
		int ch ;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		String s = " Hello World ";
		FileWriter fw = new FileWriter(file);
		fw.write(s);
		fr.close();
		fw.close();
	}
}