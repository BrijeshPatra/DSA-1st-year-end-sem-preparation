package assignment1;

import java.util.Scanner;

public class A1Q6 {
    public static boolean isOdd(int n){
        return (n&1)==1;
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= ob.nextInt();

        if(isOdd(num)){
            System.out.println(num + "is Odd");
        }else{
            System.out.println(num + "is not odd");
        }

    }
}
