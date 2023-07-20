package OOPsConcepts;

public abstract class AllOopsAbstract {
	//data hiding declaring var
   private String name;
   // No argument constructor
   public AllOopsAbstract() {
	  this.overRide();
	}
   //Parameterized constructor and Intializing var
   public AllOopsAbstract(String name) {
	   this();
	   this.name=name;
	   System.out.println("from super class constructor");
   }
   //Utilization for private var
   public String getName() {
		return name;
	}
   // abstract method
   public abstract void demoAbstract(); 
// method overLoading
   public static void test() {
	   System.out.println("Loading No Arguments"); 
   }
   // method overLoading
   public static void test(int para) {
	   System.out.println("Loading Int Para"); 
   }
   // Override concept
   public void overRide() {
	   System.out.println("from Over_ride method of abstract parent class");
   }
   
}
