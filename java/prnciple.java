public class prnciple {
    public static int performaddition(int a, int b){
        return a+b;
    }

    public static void performadditionNonReturn(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int si(int p, int t, int r)
    {
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        performadditionNonReturn(a, b);

        int c = performaddition(a, b);
        System.out.println(c);
        int simpleinterest=si(10, 20, 30);
        System.out.println("Simple Interest : "+simpleinterest);
    }
}
