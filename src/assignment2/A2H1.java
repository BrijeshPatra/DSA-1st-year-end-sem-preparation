package assignment2;

import java.util.Scanner;

class Commission{
    public double sales;


    public Commission(double sales) {
        this.sales = sales;
    }
    public double getCommision(){
        if(sales<100){
            return sales*0.02;
        } else if (sales>=500 && sales<5000) {
            return sales*0.05;
        }else{
            return sales*0.08;
        }
    }
}
public class A2H1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter sale");
        double sale= ob.nextDouble();

        Commission c=new Commission(sale);

        double cAmt=c.getCommision();
        if(cAmt==-1){
            System.out.println("Invalid input");
        }else{
            System.out.println(cAmt);
        }

    }
}
