package assignment1;

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");

        int num=ob.nextInt();

        int sum=0;
        int product=1;

        if(num>0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }

    }
}
