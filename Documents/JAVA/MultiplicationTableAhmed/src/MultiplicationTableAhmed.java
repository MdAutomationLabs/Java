
public class MultiplicationTableAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		// create  an array to generate numbers 
		int[][] data = new int[12][12];
		
         
   for (int row = 1; row<= data.length; row++){
   for (int col = 1; col <= data.length; col++){
	   System.out.printf("%4d",col*row);
	   
   }
   //to create a new line every time
        System.out.println();
  }
   }
}
	

