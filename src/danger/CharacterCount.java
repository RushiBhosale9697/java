
package danger;


public class CharacterCount {

	public static void main (String args []){

		String a="rushikesh";

		int count = 0;
		for(int i=0;i<a.length();i++){

		if(a.charAt(i)=='s'){

		count = count+1;
		}
		}

		System.out.println("Total no of s are : "+count);
		}
		

}
