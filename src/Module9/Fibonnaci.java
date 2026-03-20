package Module9;
public class Fibonnaci {
    public static int fibbonaci(int n) {
        if (n <=1) {
            return n;
        }
        return  fibbonaci(n - 1) + fibbonaci(n - 2);
    }

    static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibbonaci(i) + " ");
        }
    }
}