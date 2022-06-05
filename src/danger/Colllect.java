package danger;

import java.util.HashMap;

public class Colllect {

	public static void main(String[] args) {

		String a = "prashant rushikesh sachin prashant sagar prashant sagar sachin rushikesh bhosale baramati";
		String b [] = a.split(" ");
		
//		HashMap<String,Integer> map = new HashMap <>();
//		
//		for(String str:b) {
//			
//			Integer x = map.get(str);
//			//System.out.println(x);
//			
//			if(x==null) {
//				map.put(str, 1);
//			}else {
//				map.put(str, x+1);
//			}
//		}
//		System.out.println(map.entrySet());
		

		for(int i=0;i<b.length;i++) {
			int count = 0;

			for(int j=0;j<b.length;j++) {
				
				if(b[i].equals(b[j])){
					
					count = count+1;
					
			}
		}		
			if(count>1) {
			System.out.println(b[i]+" = "+count);
			}
	}					


}}
