import java.util.Scanner;

class BasicArithmetic {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers you would like to add together");
	
	int x = sc.nextInt();
	sc.nextLine();
	int y = sc.nextInt();
	int sum = x+y;
	int diff = x-y;
	int product = x*y;
	int quotent = x/y;
	System.out.println("Thank you! The sum of " + x + " " + "and " + y + " " + "is " + sum + ".");	
	System.out.println("The difference of " + x + " " + "and " + y + " " + "is " + diff + ".");
	System.out.println("The product of " + x + " " + "and " + y + " " + "is " + product + ".");	
	System.out.println("The quotent of " + x + " " + "and " + y + " " + "is " + quotent + ".");		
	}
}