package ch.bbw.mastermind;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 5ia14siaebersold
 *
 */
public class MainApplication {
	
	public int[] numberRow = new int[4];
	public int[] userNumberRow = new int[4];
	public int correctPositions = 0;
	public int correctNumbers = 0;

	/**
	 * Generates a NumberRow with 5 numbers
	 */
	public void generateNumberRow() {
		
		int max = 6;
		int min = 1;
		
		Random rn = new Random();
		numberRow[0] = rn.nextInt(max - min + 1) + min;
		numberRow[1] = rn.nextInt(max - min + 1) + min;
		numberRow[2] = rn.nextInt(max - min + 1) + min;
		numberRow[3] = rn.nextInt(max - min + 1) + min;
		System.out.println(numberRow[0]+""+numberRow[1]+""+numberRow[2]+""+numberRow[3]);
		
	}
	/**
	 * Reads the number input
	 */
	public void getNumberRow(){
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();

		String number = String.valueOf(numbers);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    userNumberRow[i] = j;
		}
		
		// call method checkRow()
		checkRow();
		
		//System.out.println(userNumberRow[0]+""+userNumberRow[1]+""+userNumberRow[2]+""+userNumberRow[3]);
		
	}
	/**
	 * Checks if Input equals generated number
	 */
	public void checkRow() {
		
		correctPositions = 0;
		correctNumbers = 0;
	
		if (userNumberRow[0] == numberRow[0]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[0] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[0] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[0] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[1] == numberRow[1]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[1] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[1] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[1] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[2] == numberRow[2]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[2] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[2] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[2] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[3] == numberRow[3]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[3] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[3] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[3] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (correctPositions == 4) {
			System.out.println("Congratulations! You won! :)");
		} else {
			System.out.println("correct Positions & Numbers: "+ correctPositions);
			System.out.println("correct Numbers: "+ correctNumbers);

			getNumberRow();
		}
		
	}
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		MainApplication main = new MainApplication();
		main.generateNumberRow();
		System.out.println("Geben Sie 4 Zahlen zwischen 1 & 6 ein:");
		main.getNumberRow();
		
	}
	
}
