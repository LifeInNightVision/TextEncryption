//	Encrypts a given text using the ROT 13 encryption, GUI version coming soon.
//
//	=================================================
//
	import java.io.*;
	import java.util.*;

	public class Rot13
	{
	    static Scanner console = new Scanner(System.in);
	    
	    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static void main(String args[]) throws IOException
	    {
	        String plaintext;
	        int x;
	        
	        System.out.println("Enter words to encrpyt");
	        plaintext = stdin.readLine();
	        x = plaintext.length();
	        char[] chars = new char[x];
	        for (int i = 0; i < x; i++)
	        {
	            chars[i] = plaintext.charAt(i);
	        }
	        
	        System.out.print("The encrypted text is: ");
	        
	        for (int i = 0; i < chars.length; i++)
	        {
	                if ((chars[i] >= 'a' && chars[i] <= 'm'))
	                {
	                    chars[i] += 13;
	                }
	                else if ((chars[i] >= 'n' && chars[i] <= 'z'))
	                {
	                    chars[i] -= 13;
	                }
	                else if ((chars[i] >= 'A' && chars[i] <= 'M'))
	                {
	                    chars[i] += 13;
	                }
	                else if ((chars[i] >= 'N' && chars[i] <= 'Z'))
	                {
	                    chars[i] -= 13;
	                }
	            System.out.print(chars[i]);
	        }
	    }
	}

