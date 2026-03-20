package Module5;
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=5;
        try{
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("There is Arithmetic Logical Error");
        }
        System.out.println("the value of k is :"+k);
    }


}