package Module4;

public class staticBlock {
        static{
            System.out.println(" It is executed before the Main method! ");
            System.out.println(" Waiting for execution of Main method ");
        }
        public static void main(String[] args) {
            int a=1000;
            int b=2000;
            System.out.println(" Addition value is:"+(a+b));
        }
}
