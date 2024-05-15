package assignment1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class A1Q7 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");

        int n=ob.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter number of elements");
        for (int i=0;i<n;i++){
            arr[i]= ob.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int maxCount=0;
        int minCount=0;
        int maxFirstIndex=-1;
        int minLastIndex=-1;


        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxFirstIndex=1;
                maxCount=1;
            }else if(arr[i]==max){
                maxCount++;
            }

            if(arr[i]<min){
                min=arr[i];
                minLastIndex=i;
                minCount=1;
            }else if(arr[i]==min){
                minCount++;
            }
        }
        System.out.println("Maximum element: " + max + ",Occurs " + maxCount + "times, first occurs at index: " + maxFirstIndex);
        System.out.println("Minimum element: " + min + ",Occurs " + minCount + "times, first occurs at index: " + minLastIndex);
    }
}
