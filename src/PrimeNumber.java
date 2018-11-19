import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		int loop = 0;
		
		while (loop != 1) {
			
			System.out.println("Enter a number to see it's prime or not:");
		
			if (sc.hasNextInt()) {
		
				int number = sc.nextInt();
			
				sc.nextLine();
			
				for (int x = 1; x < number; x++) {
				
					if (number % x == 0) {
					
						cont++;
					
					}
				
				}
			
				if (cont < 2) {
				
					System.out.println("Your number is a prime number!");
				
				}
			
				else {
				
					System.out.println("Your number is not a prime number!");
				
				}
			
				System.out.println("Do you want to enter another number?");
				System.out.println("Enter 0 to finish the program or enter another number to continue:");
				
				int finish = sc.nextInt();
				
				if (finish < 1) {
					
					loop = 1;
					
				}
					
			}
		
			
			else {
			
				System.out.println("Wrong, enter a positive number please:");
				
				sc.nextLine();
			
			}
		
		}	
			
		System.out.println("Thank you! Bye!");
		
	}
	
}