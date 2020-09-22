import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Klists
{
	public static double [] mergeKLists (double [][] outerArray, int elements)
		{

			//creates a new 1-d array with the length of the total elements
			double [] sortedArray = new double[elements];

			//inputs each element from the 2d array into the new array
			for (int x = 0, i=0; x < outerArray.length; x++) {
    			for (int z = 0; z < outerArray[x].length; z++) {
        			sortedArray[i] = outerArray[x][z];
        			i++;  
    				}
				}

			//uses a bubble sort to sort the elements
			boolean sorted = false;
    		double temp;
    		while(!sorted) {
        		sorted = true;
        		for (int i = 0; i < sortedArray.length - 1; i++) {
            		if (sortedArray[i] > sortedArray[i+1]) {
                	temp = sortedArray[i];
                	sortedArray[i] = sortedArray[i+1];
                	sortedArray[i+1] = temp;
                	sorted = false; }
                }
            }
            //returns the sorted array
			return sortedArray;
		}

	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //welcomes readers and allows them to input elements into the 2d array
        System.out.println("Welcome. How many arrays would you like in your 2d array? ");
        int n = input.nextInt();

        System.out.println("Welcome. How many elements would you like in each array? ");
        int m = input.nextInt();

        int elements = n*m;
		
		double [][] outerArray = new double [n][m];
        for (int d=0; d<n;d++)
        	for(int c=0; c<m; c++)
	        {
	        	System.out.println("Enter an element for position: [" + d + "][" + c + "].");
	        	int t = input.nextInt();
	            outerArray[d][c] = t;
	        }

	    //prints out the 2d array the user just created, seperated by individual array at each index
	    System.out.println("Pre-Sorted: ");
	    for (int d=0; d<n;d++)
	    {
	    	System.out.println("Array at index: " + d);
	    
        	for(int c=0; c<m; c++)
	        {
	        	System.out.println(outerArray[d][c]);
	        }
	    }

	    //prints out the sorted array
        System.out.println("Sorted: ");

        double [] arr = mergeKLists(outerArray, elements);

        for(int i=0; i<arr.length; i++)
   			System.out.println(arr[i]);

        

    }

}