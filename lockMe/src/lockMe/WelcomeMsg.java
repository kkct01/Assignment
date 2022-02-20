package lockMe;

public final class WelcomeMsg {

	private final String appName = "LockMe.com";
	private final String developerDetails = "Ken Tsang";
	private final String contactInfo = "kctsang.ken@email.com";
	
public void welcomeMsg() {
		
		System.out.println("Welcome to " + appName + "!");
		System.out.println("Developer: " + developerDetails);
		System.out.println("Email: " + contactInfo);
		
	}
	
}
