package InterfacesPrograms;

import java.util.Scanner;

public class DriverA1andA2andA3 {
	//without extending(implementing)to interface intializing the values 
	//By using upcasting initialize the values
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("PRESS '1' For *normal* intialiaZation");
		System.out.println("PRESS '2' For *Ananymous class* intialiazation");
		System.out.println("PRESS '3' For *Lamda* intialiaZation");
		int n=sc.nextInt();
		if(n==1) {
		A1 a=new AImp();
		a.show();
		a.display();
		A1.watch();
		test1();
		}
		else if(n==2) {
			/*We can intialize the interfaces by using Ananymous Class also...
			 * These classes are used for Normal and SAM interfaces for intializing 
			 */
		A1 a=new A1() {
			public void show() {
				System.out.println("Ananymous class of show Method ");
			}
			public void display() {
				System.out.println("Ananymous class of display Method");
			}
		};
		a.show();
		a.display();
		A1.watch();
		test1();
		}
		else if(n==3) {
			// This Expression Used for only after JDK 1.8 onwards
			//Lamda initialization
			A2 a=()->System.out.println("SAM ...success");
			a.sam();
			test1();
		}
		else {
			System.out.println("Invalid choice..........!");
			test1();
		}
	}

	public static void test1() {
		System.out.println();
		System.out.println("Press '1' to Continue");
		System.out.println("Press any number to end the program");
		String option = sc.next();
		if(option.equalsIgnoreCase("1")) {
		main(null);	
		}
		else {
			System.out.println("Thank you...!");
		}
		
	}
}
