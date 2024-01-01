import java.util.* ;
import java.io.*; 
public class Solution {

	private static char toUpperCase(char ch){

		if(ch >= 'a' && ch <= 'z'){
			return (char)(ch - 'a' + 'A');
		}

		return ch;
	}	

	private static boolean validString(char ch){

		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
			return true;
		}

		return false;
	}

	public static boolean checkPalindrome(String str) {
		int st = 0, en = str.length() - 1;

		while(st < en){

			if(!validString(str.charAt(st))){
				st++;
				continue;
			}

			if(!validString(str.charAt(en))){
				en--;
				continue;
			}

			char stChar = toUpperCase(str.charAt(st));
			char enChar = toUpperCase(str.charAt(en));
			
			if(stChar != enChar){
				return false;
			}

			st++;
			en--;

		}

		return true;
	}
}
