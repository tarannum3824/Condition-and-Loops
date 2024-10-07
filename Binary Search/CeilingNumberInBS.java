
public class CeilingNumberInBS {
    public static void main(String[] args) {
       int [] arr={12,23,34,45,56,67,78,700};
       int element=35;

        int result=CeilingNumber(arr,element);
        System.out.println(result);

    }

    static int CeilingNumber(int [] array,int target){
        int start=0;
        int end=array.length-1;

        if(target>array[end]){
            return -1;
        }

        boolean isAsc=array[start]<array[end];
        while(start<=end){
            int mid=start+(end-start)/2;
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
        return start;
    }
}
