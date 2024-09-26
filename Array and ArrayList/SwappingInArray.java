import java.util.Arrays;

public class SwappingInArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Array before swapping:");
        System.out.println(Arrays.toString(arr));
        swap(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr1,int index1,int index2){
        int temp=arr1[index1];
        arr1[index1]=arr1[index2];
        arr1[index2]=temp;
    }
}
