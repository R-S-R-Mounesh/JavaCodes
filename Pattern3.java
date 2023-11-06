public class Demo{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 int rows = sc.nextInt();
		 
	        for (int i = 1; i <= rows; i++) {
    	  for (int j = 1; j <=rows; j++) { 
    		  if(i<=5)
	          if(i==1||i+j==10||i==j) {
	        	  System.out.print(" *");
	          }else           
	            System.out.print("  ");         
		}
    	  System.out.println();
        	  }
}