package assignment2;

import java.util.concurrent.Callable;

class Complex{
    private double real;
    private double imag;
    void setData(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    void display(){
        System.out.println(real + " " + imag);
    }
    public Complex add(Complex complex){
        Complex res=new Complex();
        res.real=this.real+complex.real;
        res.imag=this.imag+complex.imag;
        return res;
    }
}
public class A2Q2 {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();

        c1.setData(3,5);
        c2.setData(4,-2);

        System.out.println("First complex number");
        c1.display();

        System.out.println("Second complex number");
        c2.display();

        Complex sum=c1.add(c2);
        System.out.println("Sum is");
        sum.display();
    }
}
