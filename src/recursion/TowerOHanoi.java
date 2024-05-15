package recursion;

public class TowerOHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
//        base case
        if(n==1){
            System.out.println("Transferred disk" + n + " from  " + src + "to" + dest);
            return;
        }

        //n-1 because we have to exclude first disk
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transferred disk" + n + " from  " + src + "to" + dest);
        towerOfHanoi(n-1,helper,dest,src);

    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}
