package recursion;

public class Factorial {
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact=calcFactorial(n-1);
        int res=n*fact;
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=calcFactorial(n);
        System.out.println(ans);
    }
}
