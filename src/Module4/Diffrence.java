package Module4;
import java.util.*;
public class Diffrence {
    public static void main(String[] args) {
        String s = "Virat";
        System.out.println("String before Modification: " + s);
        s = "Kholi";
        System.out.println("String after Modification: " + s);

        StringBuilder builder = new StringBuilder("Virat");
        System.out.println("StringBuilder before Modification: " + builder);
        builder.append(" Kholi");
        System.out.println("StringBuilder after Modification: " + builder);
        StringBuffer buffer = new StringBuffer("Virat");
        System.out.println("StringBuffer before Modification: " +  buffer);
        buffer.append(" Kholi");
        System.out.println("StringBuffer after Modification: " +  buffer);
    }
}
/*
ℹ️points to remember
//❌String cannot be modified
//✅StringBuilder and StringBuffer can be modified
*/
