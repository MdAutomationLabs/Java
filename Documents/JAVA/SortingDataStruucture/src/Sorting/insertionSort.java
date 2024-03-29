package Sorting;

// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns {
	private long[] a; // ref to array a
	private int nElems; // number of data items

	// --------------------------------------------------------------

	public ArrayIns(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	// --------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	// --------------------------------------------------------------
	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	// --------------------------------------------------------------
	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && a[in - 1] >= temp) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}

			a[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()
		// --------------------------------------------------------------
} // end class ArrayIns
// //////////////////////////////////////////////////////////////

class InsertSortApp {
	public static void main(String[] args) {
		int maxSize = 100000; // array size
		ArrayIns arr; // reference to array
		arr = new ArrayIns(maxSize); // create the array
		for (int j = 0; j < maxSize; j++) // fill array with
		{ // random numbers
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			arr.insert(n); // generate random number
		}
		long time1 = System.currentTimeMillis();
		arr.insertionSort();
		long time2 = System.currentTimeMillis();
		long timeTaken = time2 - time1;
		System.out.println("Size: "+ maxSize);
		System.out.println("Time in milliseconds: " + timeTaken);
	}
}
