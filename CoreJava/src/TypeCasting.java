
public class TypeCasting {

	public static void main(String[] args) {
		
		//implicit type conversion
				System.out.println("Implicit type casting:");
				
				char a = 'A';
				System.out.println("Value of a: " + a);
						
				int b = a;
				System.out.println("Value of b: " + b);
				
				float c = a;
				System.out.println("Value of c: " + c);
				
				long d = a;
				System.out.println("Value of d: " + d);
				
				double e = a;
				System.out.println("Value of e: " + e);
				
				System.out.println("\n");
				
				System.out.println("Explicit type casting");
				
				//ecplicit conversion
				double x = 45.5;
				int y = (int)x;
				System.out.println("Value of x: " + x);
				System.out.println("Value of y: " + y);
				
				System.out.println("\n");
				
				float z = 45.9f;
				long q = (long)z;
				System.out.println("Value of z: " + z);
				System.out.println("Value of q: " + q);
				
				
			}
		}
