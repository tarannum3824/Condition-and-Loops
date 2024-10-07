import java.util.Arrays;
import java.util.Scanner;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Create an array of the given size
        int[] arr = new int[n];

        // Input elements in the array
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the array
        System.out.println(Arrays.toString(arr));

        // Input the element to search
        System.out.println("Enter the element you want to search:");
        int element = sc.nextInt();

        int result=IsOABS(arr,element);
        System.out.println(result);

    }

    static int IsOABS(int [] array,int target){
        int start=0;
        int end=array.length-1;

        int mid=start+(end+start)/2;
        boolean isAsc=array[start]<array[end];
        while(start<=end){
            if (array[mid]==target){
                return mid;
            }

            if(isAsc){
                if(array[mid]>target){
                    end =mid -1;
                }else{
                    start =mid +1;
                }
            }else {
                if (array[mid] < target) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
