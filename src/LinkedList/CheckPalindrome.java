package LinkedList;
class Node {
    int data;
    Nodee next;

    Node(int data) {
        this.data = data;
    }

    class LinkedList {
        Nodee head;

        public LinkedList(Nodee head) {
            this.head = head;
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
        public boolean checkPalindrome(){
            if(head==null || head.next==null){
                return true;
            }

            //first find mid of linked list using tortoise hare method
            Nodee fast=head;
            Nodee slow=head;

            while(fast.next!=null || fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            //Next Reverse second half of the Linked List
            Nodee secondHalf=reverse(slow.next);
            Nodee firstHalf=head;

            while(secondHalf!=null){
                if(firstHalf.data!= secondHalf.data){
                    return false;
                }
                firstHalf=firstHalf.next;
                secondHalf=secondHalf.next;
            }
            return true;
        }
    }
}
public class CheckPalindrome {
    public static void main(String[] args) {

    }
}
