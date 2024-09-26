import java.util.*;
public class PassingInFunction {
    public static void main(String[] args) {
        int [] str={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(str));
        helloji(str);
        System.out.println(Arrays.toString(str));

    }

         static void helloji(int[] str1) {
        str1[4]=13;

    }
}
