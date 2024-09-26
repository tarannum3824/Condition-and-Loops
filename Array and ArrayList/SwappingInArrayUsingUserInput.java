import java.util.*;
public class SwappingInArrayUsingUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        //Decleration and inialization of an array
        int [] arr=new int[n];
        //taking user input in array
        System.out.println("Enter the elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Array before swapping:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the index1:");
        int a=sc.nextInt();
        System.out.println("Enter the index2:");
        int b=sc.nextInt();


        System.out.println("Array after wapping:");
        swapping(arr,a,b);
        System.out.println(Arrays.toString(arr));

    }
    //swapping logic
    static void swapping(int [] arr1,int x,int y){
        int temp=arr1[x];
        arr1[x]=arr1[y];
        arr1[y]=temp;
    }
}
