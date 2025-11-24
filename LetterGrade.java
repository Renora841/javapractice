import java.util.Scanner;

class LetterGrade {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int score;

	while (true) {
	System.out.println("Please provide a test grade between 0 and 100.");
	score = sc.nextInt();
	if (score >= 0 && score <= 100) {
		break;
		} else {
		System.out.println("Invalid input. Please enter a score between 0 and 100.");
			}
		}		
	if (score >= 90 ) {
		System.out.println("The letter grade for " + score + " is A.");
		} else if (score >= 80) {
		System.out.println("The letter grade for " + score + " is B.");
		} else if (score >= 70) {
		System.out.println("The letter grade for " + score + " is C."); 
		} else if (score >= 60) {
		System.out.println("The letter grade for " + score + " is D.");	
		} else {
		System.out.println("The letter grade for " + score + " is F.");
		}
	
		sc.close();
	}	
}