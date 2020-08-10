public class Tree {

    Node root;

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insertLevelOrder(int[] arr, Node root, int i) {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String args[]) {
        Tree t2 = new Tree();
        int arr[] = {5,4,8,11,-1,13,4,7,2,-1,-1,-1,-1,-1,1};
        t2.root = t2.insertLevelOrder(arr, t2.root, 0);
        t2.inOrder(t2.root);
    }
}
