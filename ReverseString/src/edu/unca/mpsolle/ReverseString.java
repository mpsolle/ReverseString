package edu.unca.mpsolle;

import java.util.Scanner;



public class ReverseString {
	public static void main(String[] args) {

	String source = "";
	Scanner input = new Scanner(System.in);
	String stringInput = input.nextLine();
	int length = stringInput.length();
	    
	for(int i = length - 1; i >= 0; i--) {
	    	source = source + stringInput.charAt(i);
	    	System.out.println(source);
	    }
	}
	
}
