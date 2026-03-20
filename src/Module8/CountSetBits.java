package Module8;
public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println("Number: " + num + " | Binary: "
                + Integer.toBinaryString(num) + " | Set Bits: " + countSetBits(num));
    }
}
