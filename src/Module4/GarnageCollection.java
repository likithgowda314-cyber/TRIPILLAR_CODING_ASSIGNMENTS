package Module4;
public class GarnageCollection {
        public static void main(String[] args) {
            String s=new String("Hello");
            String s1=new String("Likith");
            s=s1;
            System.gc();
            System.out.println(s);
        }
}
