package Module8;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "madam";
        Boolean check = isPalindrome(str1);
        if (check == true) {
            System.out.println(str1 + " is a palindrome");
        }else{
            System.out.println(str1 + " is not a palindrome");
        }
    }
}