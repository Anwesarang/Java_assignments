package Java_assignments.assign8;

public class p4 {
        public static void main(String[] args) {
            try {
                int num = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e);
            } finally {
                System.out.println("This is the finally block. It will always execute.");
            }
            System.out.println("Rest of the code...");
        }
    }
    

