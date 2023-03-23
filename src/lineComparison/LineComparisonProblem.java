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
		
		System.out.println("Enter the value of third point :");
		int p1 = a.nextInt();
		int q1 = a.nextInt();
		
		System.out.println("Enter the value of forth point :");
		int p2 = a.nextInt();
		int q2 = a.nextInt();
		
		double length1 = (int)(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		length1 = Math.sqrt(length1);
		System.out.println("Length of a first line = "+length1);
		
		double length2 = (int)(((p2-p1)*(p2-p1))+((q2-q1)*(q2-q1)));
		length2 = Math.sqrt(length2);
		System.out.println("Length of a first line = "+length2);
		
		if (length1 == length2) {
			System.out.println("The given lines are equal.");
		}
		else {
			System.out.println("The given lines are not equal.");
		}
	}
}
