package recursion;

public class ReverseString {
    public static void reverseString(String s,int idx){
        if(idx==0){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.println(s.charAt(idx));
        reverseString(s,idx-1);
    }

    public static void main(String[] args) {
        String s="Brijesh";
        reverseString(s,s.length()-1);
    }
}
