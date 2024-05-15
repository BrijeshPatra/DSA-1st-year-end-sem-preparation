package assignment2;

interface DetailInfo{
    void display();

    int count(String name);
}
class Personss implements DetailInfo{
    static int maxCount;
    String name;

    @Override
    public void display() {
        System.out.println(name);
        System.out.println(maxCount);
    }

    @Override
    public int count(String name) {
        int counts=0;
        for (int i=0;i<name.length();i++){
            counts++;
        }
        return counts;
    }
}
public class A2Q7 {
    public static void main(String[] args) {

    }
}
