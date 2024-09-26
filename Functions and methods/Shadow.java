public class Shadow {
    static int a=10;//this will shadowed at line 6 and it print 5
    public static void main(String[] args) {
        System.out.println(a);//10
        int a=5;
        System.out.println(a); //5
        run(a); //now its also return 5 as it shwodow the line 2
    }
    static void run(int p){
        System.out.println(p);
    }
}
