import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        final int SIZE = 3;
		        double grades[] = new double[SIZE];
		        double input;
		        Scanner in = new Scanner(System.in);
		        NumberFormat formatter = new DecimalFormat("#0.000");  
		        /*without error checking
		        for(int i=0; i < grades.length; i++){
		            System.out.println("Please grade " + (i + 1) );
		            grades[i]= in.nextDouble();
		        }
		        */
		        for(int i=0; i < grades.length; i++){
		            boolean inputValid = false;
		            while (!inputValid){
		                System.out.println("Please grade " + (i + 1) );
		                if (in.hasNextDouble()){
		                    grades[i]= in.nextDouble();
		                    inputValid = true;
		                } else {
		                    in.nextLine();
		                } // end else
		            } // end while
		        } // end for
		        /* let's process the grades
		         * AVERAGE */
		        double sum =0;
		        for(int i=0; i < grades.length; i++){
		            sum = sum + grades[i]; // adds to sume grades of i
		            System.out.println("grades["+i+"]=" + grades[i]);
		        }
		        System.out.println("array using Arrays.toString()" + Arrays.toString(grades));
		        double average =  computeAverage(grades); //(sum/grades.length);

		        System.out.println("Average grade is " + formatter.format(average));
		       
		        wipe out old array.
		        grades = new double[7];
		        for(int i=0; i < grades.length; i++){
		            System.out.println("grades["+i+"]=" + grades[i]);
		        }
		       
		      / for (double element: grades){
		            System.out.println("grades[?]=" + element);
		        }
		       
		        double newGrades[] = grades; // alais, we will wipe out grades in the for loop below
		        System.out.println("Print newGrades ");
		        for (double element: newGrades){
		            System.out.println("newGrades[?]=" + element);
		        }
		        for(int i=0; i < newGrades.length; i++){
		            System.out.println("Please newGrade " + (i + 1) );
		            newGrades[i]= in.nextDouble();
		        }
		        System.out.println("Print grades ");
		        for (double element: grades){
		            System.out.println("grades[?]=" + element);
		        }
		        System.out.println("Print newGrades ");
		        for (double element: newGrades){
		            System.out.println("newGrades[?]=" + element);
		        }
		        double newNewGrades[] = new double[SIZE];
		        newNewGrades = Arrays.copyOf(newGrades, SIZE); // we copied values, so newGrades is safe!!!
		        System.out.println("Print newNewGrades ");
		        for (double element: newGrades){
		            System.out.println("newNewGrades[?]=" + element);
		           
		        }
		        for(int i=0; i < newNewGrades.length; i++){
		            System.out.println("Please newNewGrade " + (i + 1) );
		            newNewGrades[i]= in.nextDouble();
		        }
		        System.out.println("Print newGrades ");
		        for (double element: newGrades){
		            System.out.println("newGrades[?]=" + element);
		        }
		        System.out.println("Print newNewGrades ");
		        for (double element: newNewGrades){
		            System.out.println("newNewGrades[?]=" + element);
		           
		        }
		       
		       
		    } // end of main

		    private static double computeAverage(double[]grades) {
		        double sum = 0;
		        for (double element: grades){
		            sum += element;
		        }
		        return sum/grades.length;
		    }

		} // end of class
	}
	
	Random randomNum = new Random();
	Scanner in = new Scanner(System.in);

	final int SIZE = 10;
	int[] values = new int[SIZE];
	for (int i = 0; i < values.length; i++) {
		int x = 1 + (int) (Math.random() * 20);
		values[i] = x;
	}
	System.out.print("All array items: ");
	for (int i = 0; i < values.length; i++) {
		System.out.print(values[i] + " ");
	}
	System.out.println();
	System.out.print("Even index items: ");
	for (int i = 0; i < values.length; i++) {
		if (i % 2 == 0) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Even index items: ");
		for ( i = 0; i < values.length; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		System.out.println();
		System.out.print("Highest number in array: ");
		int largest = values [0];
		for ( i = 1; i < values.length; i++) {
			if (values[i]> largest){
				largest = values[i];
				System.out.print(values[i]);
			}
		}
	}
		/*final int ROWS = 5;
		final int COLS = 5;
		int[][] rates = new int[ROWS][COLS];
		Scanner in = new Scanner (System.in);
		System.out.println("Enter rates");
		for (int i = 0; i <ROWS; i++){
			for (int j = 0; j <COLS; j++){
				rates[i][j] = in.nextInt();
		}

	}
		System.out.println("Enter rates");
		for (int i = 0; i <ROWS; i++){
			for (int j = 0; j <COLS; j++){
				System.out.print(rates[i][j] + " ");
			}
			System.out.println();
		}
}
}*/
 