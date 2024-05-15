package assignment1;

import java.util.Scanner;

public class A1Q8 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //input row
        System.out.println("Enter number of rows");
        int rows=ob.nextInt();

        //input col
        System.out.println("Enter number of cols");
        int cols=ob.nextInt();

        //input 2D arr
        int arr[][]=new int[rows][cols];
        System.out.println("Enter elements in 2D array");

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j]=ob.nextInt();
            }
        }

        //display 2D array
        System.out.println("The elements of 2D array are");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        //sum of 2D array
        int sum=0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
