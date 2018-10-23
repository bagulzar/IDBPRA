package de.tuberlin.dima.minidb.warm_up;

public class InsertionSort implements Sort {

	@Override
	public void createSortOperator(int array[]) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
	
	static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
  
        System.out.println(); 
    }
	
	public static void main(String[] args) {
		int array[] = {25, 56, 11, 13, 98, 20, 0, 9}; 
		  
        Sort sort = new InsertionSort();         
        sort.createSortOperator(array); 
          
        printArray(array);

	}

}
