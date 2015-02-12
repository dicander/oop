import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class RegularExpressionTestbed {
	public static void main(String[] args) {
		grep("^f.l$", "/home/dicander/Documents/finalsaol");
		grep(".{24,70}", "/home/dicander/Documents/finalsaol");
		String whatever = "\\(";
		System.out.println("\"");
		System.out.println(whatever);
		grep(whatever, "super_metroid.txt");
		experiment();
	}
	
	
	/**
	 * Looks through file filename for pattern pattern and prints those lines
	 * along with a count.
	 * @param pattern The regular expression to search for
	 * @param filename The file we are looking at, including pathname.
	 */
	public static void grep(String pattern, String filename) {
		Charset charset = Charset.forName("utf8");
		Path file = Paths.get(filename);
		try (BufferedReader reader = Files.newBufferedReader(file, charset)){
			int linesThatMatch = 0;
			while(reader.ready()) {
				String line = reader.readLine();
				if(line.matches("^.*"+pattern+".*$")) {
					++linesThatMatch;
					System.out.println(line);
				}
			}
			System.out.println("Matching lines found: " + linesThatMatch);
		} catch (IOException e) {
			System.err.println("File not found. Giving up!");
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	/**
	 * Looks through file filename for pattern pattern and prints those lines
	 * along with a count.
	 * @param pattern The regular expression to search for
	 * @param filename The file we are looking at, including pathname.
	 */
	public static void experiment() {
		Charset charset = Charset.forName("utf8");
		Path file = Paths.get("/dev/stdin");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)){
			int linesThatMatch = 0;
			while(reader.ready()) {
				String line = reader.readLine();
				System.out.println(line);
				
			}
			System.out.println("Matching lines found: " + linesThatMatch);
		} catch (IOException e) {
			System.err.println("File not found. Giving up!");
			e.printStackTrace();
			System.exit(1);
		}
		
	}
}
