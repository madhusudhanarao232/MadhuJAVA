package TyPatterns;
/**
 * This class is help to Create a Pattern
 *  <h2><mark> Pattern n=5 </mark></h2>
 *  <h3> <span>a</span> <br>
 *		 <span>a e</span> <br>
 *		 <span>a e i</span> <br>
 *		 <span>a e i o</span> <br>
 *	     <span>a e i o u</span> <br>
 *   </h3>		  
 */
public class Pattern10 {
	public static void main(String[] args) {
		/*  
		 *  a 
		 *  a e
		 *  a e i
		 *  a e i o
		 *  a e i o u
		 * 
		 */
	 char [] ch= {'a','e','i','o','u'};
	 for(int i=1;i<=5;i++) {
		 for(int j=0;j<i;j++) {
			 System.out.print(ch[j]+" ");
		 }
		 System.out.println();
	 }
	 
	}

}
