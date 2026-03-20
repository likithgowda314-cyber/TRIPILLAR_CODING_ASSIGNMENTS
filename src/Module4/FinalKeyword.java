package Module4;

public class FinalKeyword {

        public static void main(String[] args) {
            final int x=6;
            System.out.println("initial value :"+x);
            System.out.println("x remains constant: "+x);
            final StringBuilder s=new StringBuilder("Hi");
            System.out.println("initial message:"+s);
            s.append("kholi");
            System.out.println("modified message"+s);
        }

// we cannot declare value of x two times if it is final
}
