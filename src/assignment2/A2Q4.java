package assignment2;

class Deposit{
    Long principal;
    Integer time;

    Double rate;

    Double totalAmt;
    public Deposit() {
    }

    public Deposit(Long principal, Integer time, Double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public Deposit(Long principal, Integer time) {
        this.principal = principal;
        this.time = time;
    }

    public Deposit(Long principal, Double totalAmt) {
        this.principal = principal;
        this.totalAmt = totalAmt;
    }
    void display(){
        System.out.println();
    }

    void calcAmt(){
        double totalAmtt=principal+principal*rate*time/100;
        System.out.println("Total is" + totalAmtt);
    }

}
public class A2Q4 {
    public static void main(String[] args) {
        Deposit d=new Deposit(2323212292929L,11,23.4);
        d.calcAmt();
        d.display();
    }
}
