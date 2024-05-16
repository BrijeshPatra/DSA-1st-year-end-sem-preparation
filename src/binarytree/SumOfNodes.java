package binarytree;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        //creation of Binary tree
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

        public static int sum(Node root){
            if (root==null){
                return 0;
            }
            int leftSum=sum(root.left);
            int rightSum= sum(root.right);

            return leftSum + rightSum + root.data;
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree b = new BinaryTree();
            Node root = b.buildTree(nodes);

            System.out.println(sum(root));
    }
}
}
