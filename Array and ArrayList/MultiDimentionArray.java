import java.util.*;
public class MultiDimentionArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //basically we are doing 2D array
        System.out.println("Enter the number of row in an array:");
        int x=sc.nextInt();
        System.out.println("Enter the number of column in an array:");
        int y=sc.nextInt();
        int [][] arr=new int[x][y];

        //taking input
        System.out.println("Enter the element in array:");
        int i=0;
        while(i<x){
            int j=0;
            do{
               arr[i][j]=sc.nextInt();
               j+=1;
            }while(j<y);
            i+=1;
        }

        System.out.println("The given array is:");
        System.out.println(Arrays.deepToString(arr));

        //Using enhanced for loop or each for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        //printing individual element
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][1]);


    }
}
