import java.util.*;

class QuickSort
{
    int partition(int arr[], int low, int high)
    {
        int mid = (low+high)/2;

        int pivot = arr[mid]; //choosing middle element as pivot

        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    int sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

        return 0;
    }
}

class QuickDemo3{

public static void main(String args[])
    {
        Random r = new Random();
        QuickSort ob = new QuickSort();
        
        int size = 4;
        int l = 0;
        long startTime, endTime, duration;
        
        
        System.out.println("Duration\n");
        
        
            for(int i=0; i<20; i++){
            int arr[] = new int []{10,25,89,184,256,899,1000,1497,1654,1823,5014,6215,8203,10541,15478,21547, 25000,32562,37456, 42500, 50212, 58745,65987,70112,75123,77845,84532,90000,111111,115000,120000,236954};//initializing new array
            
            
           
            int right = arr.length -1;
            
            startTime = System.nanoTime();
            int result = ob.sort(arr,l, right);
            endTime = System.nanoTime();
           
            duration = (endTime - startTime);
           
            System.out.println(duration);
            
           }
          
            
            
        
    }


}