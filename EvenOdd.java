import java.util.Scanner;

class EvenOdd {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Please provide a number to determine if it is even or odd.");
	int x = sc.nextInt();

	if (x % 2 == 0){
		System.out.println("This number is even.");
		} else {
		System.out.println("This number is odd.");
		}
	}
}