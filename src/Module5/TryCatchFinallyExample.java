package Module5;
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int a,b,c=0;
        a=40;
        b=20;
        String name="Likith";
        try{
            c=a/b;
            name.charAt(7);
        }catch (ArithmeticException e){
            System.out.println("There is an Arithmetic Error");
        }catch(StringIndexOutOfBoundsException s){
            System.out.println("Invalid input");
        }finally {
            System.out.println("Code Execution Successfull");
        }
        System.out.println("The Value of c is:"+c);
    }
}