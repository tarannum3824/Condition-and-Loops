import java.sql.Array;
import java.util.*;
public class Counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==7) {
                count += 1;
            }
        }

        System.out.println("The number accure at" + count+ "times");
    }
}
