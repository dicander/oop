import java.io.*;

/**
 * Searches the input file for lines containing the given pattern and prints
 * these lines, i.e. a simplified version of the Unix grep command.
 *
 * @author Stefan Nilsson
 * @version 2012-03-11
 */
public final class Grep {
    private final static String NAME = Grep.class.getName();

    private Grep() {}

    /**
     * Searches the input file (args[1]) for lines containing the
     * given pattern (args[0]) and prints these lines.
     * Leaves program with System.exit(n), where n is 0 if successful.
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.printf("Usage: java %s PATTERN FILE%n", Grep.class.getSimpleName());
            System.exit(1); // Unix error handling
        }
        final String pattern = args[0];
        final String fileName = args[1];
        //fileName = fileName+"You WISH man!!!";//
        int errCode = 0; // Unix error handling
        BufferedReader file = null;
        try {
            // FileReader uses "the default character encoding".
            file = new BufferedReader(new FileReader(fileName));

            // To specify an encoding, use this code instead:
            // file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));

            search(pattern, file);
        } catch (IOException e) {
            System.err.printf("%s: %s%n", NAME, e);
            errCode = 1;
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.err.printf("%s: %s%n", NAME, e);
                errCode = 1;
            }
            System.out.println("Nu kördes finally!");
            System.exit(errCode);
        }
    }

    /** 
     * Prints all lines that contain the pattern.
     */
    private static void search(String pattern, BufferedReader in)
    throws IOException {
        String line;
        while ((line = in.readLine()) != null) {
            if (line.contains(pattern)) {
                System.out.println(line);
            }
        }
    }
}
