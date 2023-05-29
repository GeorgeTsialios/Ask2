package gr.upatras.ask1;

public class Main {
	public static void main(String[] args) {
		int min = 0;
		int max = 20;
		int x = (int) ((Math.random() * (max - min)) + min);
		int y = (int) ((Math.random() * (max - min)) + min);
		String subtraction_result = Calculator.subtract(x, y);
		System.out.print(x + " - " + y + " = " + subtraction_result);
	}
}


