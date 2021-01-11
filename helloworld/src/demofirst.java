import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class demofirst {
		public static void ccr(int amount) 
	    { 
	        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10}; 
	        int[] ct = new int[7]; 
	        for (int i = 0; i < 7; i++) { 
	            if (amount >= notes[i]) { 
	                ct[i] = amount / notes[i]; 
	                amount = amount - ct[i] * notes[i]; 
	            } 
	            
	        }
	        for (int i = 0; i < 7; i++) { 
	            if (ct[i] != 0) { 
	                System.out.println(notes[i] + " : "
	                    + ct[i]); 
	            } 
	        } 
	    } 
		public static void main(String argc[]){ 
	        int amount = 1230; 
	        ccr(amount); 
	    } 
	}
	


