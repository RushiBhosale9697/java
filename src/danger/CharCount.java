package danger;

public class CharCount {

	public static void main(String[] args) {
		
		String a = "prashant rushikesh sachin";
		
		for(char i='a';i<'z';i++) {
			int count = 0;
			for(int j=0;j<a.length();j++) {
			if(a.charAt(j)==i){
				
				count = count+1;
		}
		}
			if(count>=1) {
			System.out.println(i+"="+count);
			}
		}
	}

}
