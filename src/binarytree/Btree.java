package binarytree;

import java.util.LinkedList;
import java.util.Queue;

import static binarytree.Btree.BinaryTree.*;

public class Btree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        //creation of Binary tree
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node n=new Node(nodes[idx]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);

            return n;
        }
        //traversal-pre-order,in-order,post-order -> DEPTH FOR SEARCH
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
        //Breadth For Search -> Level Order
        public static void levelOrder(Node root){
            if (root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node curr=q.remove();
                if (curr==null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else {
                    System.out.println(curr.data);
                    if (curr.left!=null){
                        q.add(curr.left);
                    }

                    if (curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b=new BinaryTree();
        Node root=b.buildTree(nodes);

        System.out.println(root.data);
        preorder(root);
        inorder(root);
        postorder(root);
        levelOrder(root);
    }
}
