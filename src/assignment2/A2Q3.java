package assignment2;
class Product{
    int prodId;
    double price;

    int quantity;

    static int totalPrice;
    public Product(int prodId,double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice+=price*quantity;
    }
    void display(){
        System.out.println(prodId);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println();
    }

}
   public class A2Q3 {
    public static void main(String[] args) {
        Product p1=new Product(101,30.0,3);
        Product p2=new Product(101,30.0,3);
        Product p3=new Product(101,30.0,3);
        Product p4=new Product(101,30.0,3);
        Product p5=new Product(101,30.0,3);

        System.out.println("Purchase products");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}
