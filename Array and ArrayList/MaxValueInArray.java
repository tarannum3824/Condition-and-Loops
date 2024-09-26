import java.util.*;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,23,43,21,78,32,100};

        System.out.println( max(arr));
        System.out.println( maxab(arr));
    }

    //max value between index 0 to n-1
    static int max(int [] arr1){
        int maxval=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>maxval){
                maxval=arr1[i];
            }
        }
        return maxval;
    }

    //max value between index a and b
    static int maxab(int[] arr1){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of index1:");
        int a=in.nextInt();
        System.out.println("Enter the value of index2:");
        int b=in.nextInt();
        
        int max = 0;
        
        for(int i=a;i<=b;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        return max;
    }
}
