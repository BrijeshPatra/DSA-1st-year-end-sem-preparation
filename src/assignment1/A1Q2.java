package assignment1;

import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your weight");

        double w= ob.nextDouble();

        if(w<18.5){
            System.out.println("underweight");
        } else if (w>=18.5 && w<=24.9) {
            System.out.println("Normal weight");
        } else if (w>=25.0 && w<29.9) {
            System.out.println("Overweight");
        }else if (w>=30.0){
            System.out.println("Obese");
        }else{
            System.out.println("Invalid weight");
        }
    }
}
