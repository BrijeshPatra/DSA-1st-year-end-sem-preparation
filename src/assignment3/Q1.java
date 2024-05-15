package assignment3;

public class Q1 {
    public static int abc( int a,int b) {
        if (b== 0) {
            return 1;
        } else {

            return abc(a+1,b+1);
        }
    }
    public static void main(String[] args) {
        int res=abc(5,4);
        System.out.println(res);
    }
}
