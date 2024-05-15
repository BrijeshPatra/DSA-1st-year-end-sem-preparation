package assignment1;

import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string");

        String s = ob.next();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    // Ensure each character appears exactly once in the permutation
                    if (i != j && i != k && j != k) {
                        System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                    }
                }
            }
        }
    }
}
