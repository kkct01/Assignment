package lockMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LockMe {

	public static void main(String[] args) throws IOException {
		
		//Welcome message, immutable
		WelcomeMsg msg = new WelcomeMsg();
		msg.welcomeMsg();
		
		//Filter out all folders
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if (name.startsWith(".")) {
				return false;
			} else {
				return true;
			}
			}
		};
			
		//Present working directory
		File pwd = new File(".");
		String contents[] = pwd.list(filter);
		
		Scanner scanner = new Scanner(System.in);
				
		while (true) {
		
		System.out.println("\nWhat do you want to do?\n"
				+ "(1) List all files in the directory\n"
				+ "(2) More options\n"
				+ "(3) Quit");
		String selection1 = scanner.nextLine();
		
		outer:
		switch(selection1) {
			
			case "1": //List all files in the directory
				
				for(String content : contents) {
					System.out.println(content);
				}
				break;
			
			case "3": //Quit
				
				System.out.println("\nThank you for using Lockme.com");
				
				try {
				Thread.sleep(4000);
				}
				catch (InterruptedException e) {
					System.out.println(e);
				}
				scanner.close();
				System.exit(0);
							
			case "2": //More options
				
				while (true) {
								
				System.out.println("\nPlease select an operation:\n"
						+ "(1) Add a new file\n"
						+ "(2) Delete an existing file\n"
						+ "(3) Search a file\n"
						+ "(4) Return to the top");
				String selection2 = scanner.nextLine();
				
				switch(selection2) {
				
				case "1": //Add a new file
					
					System.out.print("\nEnter the new file name: ");
					String strpath = scanner.nextLine();
					
					Path pwd1 = Paths.get(strpath);
					
					if (Files.exists(pwd1)) {
						System.out.println("\nFile already exists.");
					} else {
						Files.createFile(pwd1);
						System.out.println("\nFile added.");
					}
					
					continue;
				
				case "2": //Delete a file
					
					try {
					
						System.out.print("Enter the file name you want to delete: ");
						String garbage = scanner.nextLine();
					
						Path pwd2 = Paths.get(garbage);
											
						Files.delete(pwd2);
						System.out.println("\nFile deleted.");
						
					} catch (FileNotFoundException e) {
						System.out.println("\nFile not found.");
					}
					
					continue;
				
				case "3": //Search a file
					
					ArrayList<String> arrayFiles = new ArrayList<>();
				
					for(String content : contents) {
						arrayFiles.add(content);
						}
				
					System.out.print("\nEnter the file name you are looking for: ");
					String lookUpFile = scanner.nextLine();
				
					if(arrayFiles.contains(lookUpFile)) {
						System.out.println("\nYes, " + lookUpFile + " is in the directory.");
					} else {
						System.out.println("\nFile not found.");
					}
					
					continue;
					
				case "4": //Return to the top
					break outer;
										
				default:
					System.out.println("\nPlease enter a valid choice!");
					continue;
				}
				}
			default:
				System.out.println("\nPlease enter a valid choice!");
				continue;
		}
		}
	}
}
				
	
 

