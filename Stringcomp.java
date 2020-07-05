package Hackerrank;
import java.util.*;

public class Stringcomp {
static String superReducedString(String s) {
		    for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == s.charAt(i-1)) {
	                s = s.substring(0, i-1) + s.substring(i+1);
	                i = 0;
	            }
	        }
        if(s.isEmpty())
            return "Empty String";
        return s;
    }
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter string=");
		String s=sc.next();
		String s1=superReducedString(s);
		System.out.println(s1);

	}

}
