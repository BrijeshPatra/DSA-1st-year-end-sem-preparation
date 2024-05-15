package assignment1;

import java.util.Scanner;

public class A1Q5 {
    public static int sum_Of_Digits(int n){
        while (n>=10){
            int sum=0;
            if(n!=0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int num=12345;
        int res=sum_Of_Digits(num);
        System.out.println(res);
    }
}
