class LiniarSearch{
    public static void main(String [] args){
        int [] arr={12,34,54,23,98,67,54,34,90};
        int target=98;
        System.out.println(search(arr,target));
    }

    static int search(int [] array,int target){
        if(array.length==0){
            return -1;
        }

        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
         return 0;
    } 
}