
import java.util.*;

public class gradeaverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter yout math grade:");
		double m = input.nextDouble();
		System.out.print("Enter yout physics grade:");
		double p = input.nextDouble();
		System.out.print("Enter yout chemistry grade:");
		double c = input.nextDouble();
		System.out.print("Enter yout Turkish grade:");
		double t = input.nextDouble();
		System.out.print("Enter yout music grade:");
		double u = input.nextDouble();
		double average = ((m + p + c + t + u) / 5);
		System.out.println("Your avarage grade is: " + average);
		String g = (average >= 55) ? "Pass" : "Stayed";
		System.out.println(g);
	}

}
