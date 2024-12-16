public class class1 {
    public static String valReturn() {
        return "World";
    }
    public static void valnonReturn(String c1) {
        System.out.println(c1);

    }
    public static void main(String args[]) {
        String noncreateMessage= "Hello";
        valnonReturn(noncreateMessage);
        String retur=valReturn();
        System.out.println(retur);
        // valnonReturn();
    }
    
}