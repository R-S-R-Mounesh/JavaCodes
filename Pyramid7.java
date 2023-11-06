public class Demo{
	public static void main(String[]args) {
	
		 int rows = 9;
		 int count =1;
	        for (int i = 1; i <= rows; i++) {
	        	  for (int k = i; k <=rows; k++) {
		                System.out.print(" ");
		            }
	           
	            for (int k = 1; k <=i; k++) {
	                System.out.print(k+" ");
	            }
	            System.out.println();
	           count++;
		}
	}
}

