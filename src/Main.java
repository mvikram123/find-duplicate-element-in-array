//find duplicate element in array 

//first method: HashSet
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,2,4,5,6,6,7,8,8};
        int n=arr.length;
        HashSet<Integer> duplicate=new HashSet<>();
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    duplicate.add(arr[i]);
                }
            }
        }
        for(Integer num: duplicate)
        {
            System.out.print(num+" ");
        }

    }
}
//T.C=O(n^2)


//another method: using HashMap

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 9, 8, 4, 5, 8};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
// T.C=o(n)+o(n)=O(n)



//another method
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    
	    int arr[]={1,4,5,4,1,6,7,6};
	    
	    int count=0;
	    int n=arr.length;
	    int duplicates[]=new int[n];
	    Arrays.sort(arr);
	    for(int i=0; i<n-1; i++)
	    {
	        
	        
	        if(arr[i]==arr[i+1])
	        {
	         	System.out.print(arr[i]+" "); 
	       
	        }
	    }
	    
	}
}
// T.C=o(nlogn)+o(n)=O(nlogn)
