package LinkedList;

class Nodee {
    int data;
    Nodee next;

    Nodee(int data){
        this.data=data;
    }
    class LinkedList{
        Nodee head;

        public LinkedList(Nodee head){
            this.head=head;
        }
        public Nodee reverse(Nodee head){
            Nodee curr=head;
            Nodee prev=null;

            while(curr!=null){
                Nodee temp=curr.next;
                curr.next=prev;

                prev=curr;
                curr=temp;
            }
            return prev;
        }
        public Nodee reverseRecursively(Nodee head){
            if(head==null || head.next==null){
                return head;
            }
            Nodee newHead=reverse(head.next);
            Nodee headNext=head.next;

            headNext.next=head;
            head.next=null;

            return newHead;
        }
    }
}
public class ReverseLL {
    public static void main(String[] args) {

    }
}
