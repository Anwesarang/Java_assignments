package Java_assignments.assign8;

public class p1 {
        public static void main(String[] args) {
            try {
                int[] arr = {1, 2, 3, 4, 5};
                // Trying to access an invalid index
                System.out.println(arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bound Exception caught: " + e);
            }
        }
    }
