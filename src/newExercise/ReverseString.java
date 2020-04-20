package newExercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in the phrase you want to invert.");
		String input = sc.nextLine();

		String output = reverse(input);
		System.out.println(output);
	}
	
	public static String reverse(String input) {
		String reverse = "";
		
		if(input.isEmpty() || input == null ) {
			System.out.println("empty and null Strings are not accepted. Try again.");
		}
		
		if(input.length()<=1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for(String item:originalArray) {
				reverse = item + " " + reverse;
			}
			
		}
		
		return reverse.trim();
		
	}

}
