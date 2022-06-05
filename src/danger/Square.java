package danger;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start no");
        int start_no = sc.nextInt();
        
        System.out.println("Enter the end no");
        int end_no = sc.nextInt();
        
		int i,j,square = 0;
	    //int end_no=10, start_no=5;
		
		for(i=start_no;i<=end_no;i++) {
			
			for(j=start_no;j<=end_no;j++) {
				
				if(i==j) {
				 square = i*j;
					
				
				}
			} 
			System.out.println(i+" = "+square);
		}				


	}

}


