
package danger;

public class CharSepration {
	public static void main(String[] args) {

		String input = "!@jkAgu8yawfuiUF/,-;:+0)(FYIUF"
				+ "5lhuydyvioipuibj+66+5468798^Uni23657/9465464#$%^&*";
		
		System.out.print("Capital characters are: ");
		for(int i=0;i<input.length();i++) {
               if((input.charAt(i)>='A')&&(input.charAt(i)<='Z')) {
            	   char abc =input.charAt(i);
				System.out.print(abc);	
			}
		}
		
		System.out.println();
		
		System.out.print("Integer numbers are: ");
               for(int j=0;j<input.length();j++) {
			if((input.charAt(j)>='0')&&(input.charAt(j)<='9')) {
				System.out.print(input.charAt(j));
			}
               }
               System.out.println();
               
               System.out.print("Small characters are: ");
			for(int k=0;k<input.length();k++) {
                  if((input.charAt(k)>='a')&&(input.charAt(k)<='z')) {
				System.out.print(input.charAt(k));
		}
	}
			System.out.println();
    
    System.out.print("Symbols are are: ");
	for(int l=0;l<input.length();l++) {
       if((input.charAt(l)<'0')||(input.charAt(l)=='@')) {
		System.out.print(input.charAt(l));
       }}}}
