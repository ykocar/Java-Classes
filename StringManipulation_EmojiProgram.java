package day19_stringManipulation;

import java.util.Scanner;

public class StringManipulation_EmojiProgram {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your emoji:");
		
		
		String emoji= input.next();
		
		if(emoji.length()!=2) {
			System.out.println("Invalid emoji");
			return; //stop execution
		}
		
		//if code reaches this point,then emoji is two chars
		//get first and second chars ans assign to variables
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first== ':') {
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Upset");
			}else {
				System.out.println("Unknown emoji");
				}
		}else if(first== ';') {
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Surprised");
			}else {
				System.out.println("Unknown emoji");
		}
		}else {
			System.out.println("Invalid");

	}
}
}