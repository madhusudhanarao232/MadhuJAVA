package InterfacesPrograms;

public class Driver2A1_A2_A3 implements A1,A2,A3 {

	@Override
	public void sam() {
		System.out.println("SAM.....");
	}

	@Override
	public void show() {
	
	System.out.println("show....");	
	}

	@Override
	public void display() {
	System.out.println("display.....");	
	}
	public void madhu() {
		System.out.println("MADHU");
	}
	public static void main(String[] args) {
		 Driver2A1_A2_A3 d=new Driver2A1_A2_A3();
		 d.display(); 
		 d.sam();
		 d.show();
		 d.sam();
		 A1.watch();
		 if (d instanceof A3) {
			 System.out.println("MARKER interface implemented");
			d.madhu(); 
		 }
		 else {
			 System.out.println("NOT implementing the interface");
		 }
	}

}
