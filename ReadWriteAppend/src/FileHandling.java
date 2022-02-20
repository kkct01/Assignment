import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		String pwd = "C:\\Users\\kkct0\\eclipse-workspace\\ReadWriteAppend\\file1.txt";
		Path path = Paths.get(pwd);
		
		while (true) {
		
		System.out.println("\nEnter the operation you want to do:");
		System.out.println("1. Read, 2. Write, 3. Append");
		String answer = scanner.nextLine();
		
		try {
		
		switch(answer) {
		
		case "1":
			System.out.println(Files.readAllLines(path));
			break;
			
		case "2":
			System.out.println("New entry to write: ");
			String str1 = scanner.nextLine();
			FileOutputStream fos = new FileOutputStream(pwd);
			fos.write(str1.getBytes());
			fos.close();
			break;
			
		case "3":
			System.out.println("New entry to append: ");
			String str2 = scanner.nextLine();
			Files.write(path, str2.getBytes(), StandardOpenOption.APPEND);
			break;
			
		default:
			System.out.println("invalid entry");
			continue;
		} 
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			continue;
		}
				
		inner:
		while (true) {
			
		System.out.println("\nQuit (y/n)");
		String answer2 = scanner.nextLine();
		
		switch(answer2) {
		
		case "y":
			System.out.println("Thank you, good bye");
			scanner.close();
			System.exit(0);
		case "n":
			break inner;
		default:
			System.out.println("invalid entry");
			continue;
		}
		}
		}
	}
}
		