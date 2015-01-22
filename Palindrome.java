import java.util.*;

public class Palindrome {

    /**
     * This program takes lines of text as input and outputs each line
     * that is a palindrome.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            if(palindrome(line) && line.length()>1) {
                System.out.println(line);
            }
        }
    }

    /**
     * Returns true if candidate is a palindrome, false otherwise.
     */
    static boolean palindrome(String candidate) {
        int length = candidate.length();
        int halfie = length/2;
        for(int i=0; i<halfie; ++i) {
            if(candidate.charAt(i)!=candidate.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
