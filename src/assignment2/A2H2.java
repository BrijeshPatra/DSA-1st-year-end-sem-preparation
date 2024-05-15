package assignment2;

class Book{
    String Bname;
    int Bedition;

    public int getBprice() {
        return Bprice;
    }

    public void setBprice(int bprice) {
        Bprice = bprice;
    }

    int Bprice;

    public Book(String bname, int bedition, int bprice) {
        Bname = bname;
        Bedition = bedition;
        Bprice = bprice;
    }

    public static Book findMaxPrice(Book... books) {
        Book maxPriceBook=null;
        double maxPrice=Double.MIN_VALUE;


        for (Book book:books){
            if (book.getBprice()>maxPrice){
                maxPrice=book.getBprice();
                maxPriceBook=book;
            }
        }
        return maxPriceBook;
    }

    void display(){
        System.out.println(Bname);
        System.out.println(Bedition);
        System.out.println(Bprice);
    }
}
public class A2H2 {
    public static void main(String[] args) {
        Book b1=new Book("History",8,900);
        Book b2=new Book("Civics",9,8000);
        Book b3=new Book("Java",11,100);
        Book b4=new Book("Python",6,200);


        Book maxPrice= Book.findMaxPrice(b1,b2,b3,b4);

        System.out.println("Book having max price is " + maxPrice.toString());

    }
}
