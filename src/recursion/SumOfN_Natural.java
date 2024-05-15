package recursion;

public class SumOfN_Natural {
    public static void sumOfNaturalNumb(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNaturalNumb(i+1,n,sum);
    }
    public static void main(String[] args) {
        sumOfNaturalNumb(1,5,0);
    }
}
