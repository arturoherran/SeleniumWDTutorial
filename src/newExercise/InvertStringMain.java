package newExercise;

import java.util.Scanner;

public class InvertStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in the phrase you want to invert.");
		String userString = sc.nextLine();
		
		if(userString.isEmpty() || userString == null ) {
			
			System.out.println("empty and null Strings are not accepted. Try again.");
			
		}	else {

			String [] arrToInvert = newArr(userString);
			invertString(arrToInvert);

		}	
		
	}
	
	
	public static String[] newArr (String userString) {
		
			String[] newArray = userString.split("");			
			return newArray;
		
	}
	
	public static void invertString(String [] invertThisString) {
		
		String[] localArr = invertThisString;
			
		for(int i=localArr.length-1; i>=0; i--) {
			System.out.print(localArr[i]);
		}
		
	}
	

}


