package assignment1;

import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter a positive integer greater than 2");

        int n=ob.nextInt();

        if(n<=2){
            System.out.println("Please enter a positive integer greater than 2");
        }
        int count=0;
        if(n>=2){
            n/=2;
            count++;
        }
        System.out.println(count);
    }
}