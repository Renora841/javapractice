import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = 0;
	
	while (true) {
		System.out.println("Please enter a number larger than 0 and less that 10.");
		x = sc.nextInt();
	
		if (x > 0 && x < 10) {
			break;
			} else {
			System.out.println("Invalid entry. Please enter a number between 1 and 10.");
			}
		}
	for (int i = 1; i <= 10; i++) {
		System.out.println(x + "x " + i + " " + "=" + " " + x*i);
		}
	sc.close();
	}
}