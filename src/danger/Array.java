package danger;

public class Array {//sum 10 ahe ase char seprate

	public static void main(String[] args) {
		
		int a[]= {1,7,6,5,2,8,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]+a[j]==10) {
					
					//System.out.println("addition is "+ a[i]+"+"+ a[j]+"= "+(a[i]+a[j]));
					System.out.println("{"+a[i]+","+a[j]+"}");
				}
			}
		}
	
	}

}
