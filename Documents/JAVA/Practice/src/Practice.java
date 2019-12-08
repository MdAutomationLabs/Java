
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] data = new int[5][5];
            
		    data = timesTable(5,5);


		    for (int row = 1; row < data[].length ; row++)
		    {
		        for (int column = 1; column < data[row].length; column++)
		        {
		            System.out.printf("%2d ",data[row][column]);
		        }
		        System.out.println();
		}
	}

	private static int[][] timesTable(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}


