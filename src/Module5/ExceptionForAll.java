package Module5;
public class ExceptionForAll {
    public static void main(String[] args) {
        int a,b,c=0;
        a=10;
        b=0;
        String s="Hitler";
        try{
            c=a/b;
            s.charAt(9);
        }catch (Exception e){
            System.out.println("there is some invalid input");
        }
        System.out.println("the value of c is "+c);
    }
}