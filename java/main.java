public class main {
    public static int addreturn(int a,int b)
    {
        return a+b;
    }
    public static void addnonreturn(int a,int b)
    {
        System.out.println("The sum is "+(a+b));
    }
    public static void main (String args[]) {
    // int a=add(10,20);
    // System.out.println(a);
    int a=10;int b=20;
    int c=addreturn(a,b);
    System.out.println(c);
    addnonreturn(40,50);
    }
}