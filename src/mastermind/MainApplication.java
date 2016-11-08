package mastermind;

import java.util.Random;

public class MainApplication {
	
	private int[] numberRow = new int[4];
	
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
	
	public static void main(String[] args) {
		MainApplication main = new MainApplication();
		main.generateNumberRow();
	}
	
}
