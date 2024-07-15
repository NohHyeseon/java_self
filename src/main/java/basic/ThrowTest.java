package basic;

public class ThrowTest extends Exception {
 public static void main(String[] args) {
     int n1, n2;
     n1=12;
     n2=0;

     try{
      throwTest(n1,n2);
     }catch (ArithmeticException | NumberFormatException e){
      System.out.println("ArithmeticException: "+e.getMessage());
     }
 }

 private static void throwTest(int n1, int n2) throws ArithmeticException{
  System.out.println("throw n1/n2: "+n1/n2);
 }

}
