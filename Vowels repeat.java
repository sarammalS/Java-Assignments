import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
	   String s="leetcode";
	   StringBuilder sb = new StringBuilder(s);
	   int l=0;
	    int r= s.length()-1;
	    while(l<r){
	        if(isVowel(s.charAt(l)) && isVowel(s.charAt(r))){
	            char t = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, t);
            l++;
            r--;
	        }
	        else if (isVowel(s.charAt(l))){
	            r--;
	        }
	        else{
	            l++;
	        }
	    }
		System.out.println(sb);

	}
}
//hello-holle
