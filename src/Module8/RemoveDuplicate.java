package Module8;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Original String: " + str + " ");
        String result = removeDuplicates(str);
        System.out.println("After Removing Duplicates:" + result + " ");
    }
}