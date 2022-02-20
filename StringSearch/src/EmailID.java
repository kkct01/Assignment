import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmailID {

	public static void main(String[] args) {
		
		
		
		Map<String, String> emailList = new HashMap<>();
		
		emailList.put("ANN", "ann@email.com");
		emailList.put("BOB", "bob@email.com");
		emailList.put("CARR", "carr@email.com");
		
		while (true) {
		
		System.out.println("\nPlease enter the employee's name: ");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();
		
		if (emailList.get(key.toUpperCase()) != null) {
			System.out.println(emailList.get(key.toUpperCase()));
		} else {
			System.out.println("There is no such employee.");
		}
		
		inner:
		while (true) {
		
		System.out.println("\nDo you want to quit? (y/n)");
		String answer = scanner.nextLine();
		
		switch(answer) {
		case "y":
			System.out.println("Thank you for using the email search system");
			scanner.close();
			System.exit(0);
		case "n":
			break inner;
		default:
			System.out.println("Please enter a valid entry");
			continue;
		}
		}
		}
	}
}
		