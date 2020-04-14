public class EmailTest {
    private static Email email;
    public static final String[] validEmail = new String[] {"a@gmail.com", "xy@abc.com", "x@abc.net"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "@#ac@gmail.com", "ac@gmail."};

    public static void main(String[] args) {
        email = new Email();
        for (String newEmail : validEmail){
            boolean isValid = email.validate(newEmail);
            System.out.println("Email is " + newEmail + " is valid: " + isValid);
        }
        for (String newEmail : invalidEmail){
            boolean isValid = email.validate(newEmail);
            System.out.println("Email is " + newEmail + " is valid: " + isValid);
        }
    }
}
