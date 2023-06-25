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