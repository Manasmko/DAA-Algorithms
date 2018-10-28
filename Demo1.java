import java.util.*;

class InsertionSort
{
    /*Function to sort array using insertion sort*/
    int sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		return 0;
    }
}


class Demo1{

public static void main(String args[])
    {
        Random r = new Random();//will be used for generating random number
        InsertionSort ob = new InsertionSort();
		
        int size = 10000;
		int l = 0;
        long startTime, endTime, duration;
		
		
		System.out.println("Duration\n");
		
      	for(int i =0;  i<30; i++ ){
			int arr[] = new int [size];
			
			//intiaialization of array
			for(int j =0; j<size; j++){
                arr[j] = r.nextInt(size);
            } 
           
			int right = arr.length -1;
			
            startTime = System.nanoTime();//used to measure time in ns
            int result = ob.sort(arr);
            endTime = System.nanoTime();
           
            duration = (endTime - startTime);
           
            System.out.println(duration);
            
           
          
            size+=10000;//repeat the process next time with set of 10000 numbers more
			
        }
    }


}
