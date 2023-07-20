package TYArray;

public class Swap1stAndLastWords {

	public static void main(String[] args) {
		String s="I am a student ab cd ";
	       String []split=s.split(" ");
	       
	       String temp=split[0];
	       split[0]=split[split.length-1];
	       split[split.length-1]=temp;
	       
	       for(int i=0;i<split.length;i++) {
	    	   System.out.print(split[i]+" ");
	       }
	       
	}

}
