package stack;
 class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
 class Stack{
     static Node head;

      public Stack(){
          this.head=null;
      }
     public static boolean isEmpty(){
         return head==null;
     }
     //Add operation in stack using linked list
     public static void push(int data){
          Node newNode=new Node(data);
         if(isEmpty()){
             head=newNode;
         }else {
             newNode.next=head;
             head=newNode;
         }
     }
     //Remove element
     public static int pop(){
          if(isEmpty()){
              return -1; //stack is empty
          }
        int top=head.data;
        head=head.next;
        return top;
     }
     //Peek element
     public static int peek(){
          if (isEmpty()){
              return -1;
          }
          return head.data; //top element
     }
}
public class StackWithLL {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
