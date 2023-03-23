package lineComparison;

import java.util.Scanner;

public class LineComparisonProblem {
	public static void main(String[] args) {
		System.out.println("Calculate the length of a line using Cartecian co-ordinate system.");

		System.out.println("Enter the value of first point :");
		Scanner a = new Scanner(System.in);
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		
		System.out.println("Enter the value of secound point :");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		
		int length = (int)(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("Length of a line = "+Math.sqrt(length));
	}
}
