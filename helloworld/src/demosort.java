
import java.util.*;

public class sortdemo {
	
	static char[] moveVowels(String input) {
		for(int i=0;i<input.length();i++) {
		char c=input.charAt(i);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
			arr[j]=c;
			j=j+1;
		}	
		}
		for(int k=0;k<input.length();k++) {
			char c=input.charAt(k);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				arr[j]=c;
				j=j+1;
			}	
		return arr;
	}

	public static void main(String[] args) {
		String input="Cosmopolitan";
		char []res=sortdemo.moveVowels(input);
		for(char c :res) {
			System.out.print(c);
		}

	}

}

