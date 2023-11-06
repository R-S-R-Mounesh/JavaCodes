public class Demo{
	public static void main(String[]args) {
		 int rows = 9;
		 
	        for (int i = 1; i <= rows; i++) {
	        	
    	  for (int j = 1; j <=rows; j++) { 
   		  if(j<=5)
    		  if(j==5||i+j==6||i-j==4) {
	        	  System.out.print("* ");
	          }else           
	            System.out.print("  ");         
		}
    	  System.out.println();
        	  }
	}
}