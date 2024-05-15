package recursion;

public class MoveAllX {
    public static void moveX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for (int i=0;i<count;i++){
                newString+='x';
            }
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveX(str,idx+1,count,newString);
        }else{
            newString+=currChar;
            moveX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String s="abxxfghxeqo";
        moveX(s,0,0,"");
    }
}
