package Question9;
import java.io.*;
public class tryResource {
	 public static void main(String[] args) {
	 try (FileInputStream fileInputStream = new FileInputStream("myfile.txt");
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
		    String line;
		    while ((line = bufferedReader.readLine()) != null) {
		        System.out.println(line);
		    }

		} catch (IOException e) {
		    System.err.println("An error occurred: " + e.getMessage());
		}
}
}
