public class class2 {
    public static void main(String[] args) {
        // Call the method with name, mobile, and email
        String userDetails = getUserDetails("vin", "1234567890", "vin.abc@example.com");
        System.out.println(userDetails);
    }

    // Method with name, mobile, and email as arguments and return
    public static String getUserDetails(String name, String mobile, String email) {
        return "Name: " + name + ", Mobile: " + mobile + ", Email: " + email;
    }
} 
