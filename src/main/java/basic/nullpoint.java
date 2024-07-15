package basic;

public class nullpoint {
    public static void main(String[] args) {
        Person person = null;
        try{
            System.out.println();
        }catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }


}

