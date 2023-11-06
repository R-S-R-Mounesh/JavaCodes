public class Demo{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 int rows = sc.nextInt();
		 
	        for (int i = 1; i <= rows; i++) {
	        	
    	  for (int j = 1; j <=rows; j++) { 
    		  if(j<=5)
    		  if(j==1||j==i||i+j==rows+1) {
	        	  System.out.print("* ");
	          }else           
	            System.out.print("  ");         
		}
    	  System.out.println();
        	  }
}