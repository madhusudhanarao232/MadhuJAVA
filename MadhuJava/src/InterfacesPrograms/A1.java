package InterfacesPrograms;

interface A1
// Normal Interface ---> The interface is having more than one method is called as Normal interface
{
	void show();
	void display();
	static void watch() {
		System.out.println("watching...");
	}

}
class AImp implements A1{
	public void show() {
		System.out.println("showing..");
	}
	public void display() {
		System.out.println("displaying..");
	}
	public static void main(String[] args) {
		AImp a=new AImp();
		a.display();
		a.show();
		A1.watch();
	}
}
