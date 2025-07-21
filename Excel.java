import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    StringBuilder str= new StringBuilder();
	    int i=s.nextInt();
		while(i>0){
		    i--;
		    int b= i%26;
		    str.append((char)(b+'A'));
		    i=i/26;
		    
		}
		System.out.println(str.reverse().toString());

	}
}
