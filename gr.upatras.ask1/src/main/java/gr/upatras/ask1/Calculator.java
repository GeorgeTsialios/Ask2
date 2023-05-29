package gr.upatras.ask1;

public class Calculator {
	public static String subtract(int x, int y) {
		if ((x - y) >= 0)
			return "POSITIVE";
		else
			return "NEGATIVE";
	}
} 