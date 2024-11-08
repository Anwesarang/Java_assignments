package Java_assignments.assign8;

public class p2 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("Null pointer exception caught: " + e);
        }
    }
}
