package Java_assignments.assign8;

public class p3 {
    public static void main(String[] args) {
        String str;
        try{
            str = "abc";
            int num = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Number format exception caught: " +e);
        }
    }
}
