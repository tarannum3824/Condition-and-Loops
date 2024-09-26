public class SwapTwoNumbers {
    public static void main(String[] args) {
        STN(2,3);
    }

     static void STN(int a,int b) {
        System.out.println("The value before swapped is"+ "a is "+ a + " and b is " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value after swapped is"+ "a is "+ a + " and b is " + b);
    }
}
