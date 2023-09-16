package TyPatterns;
  /**
   *  This Pattern 11 program help to Draw a pattern like
   *  <h2>Pattern n=5 </h2>
   *  <h3> 
   *     A <br>
   *     A B <br>
   *     A B C <br>
   *     A B C D <br>
   *     A B C D E <br></h3>
   */
public class pattern11 {
	public static void main(String[] args) {
		/*
		 *     A 
         *     A B 
         *     A B C 
         *     A B C D 
         *     A B C D E 
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				   char ch = (char)(j+64);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
