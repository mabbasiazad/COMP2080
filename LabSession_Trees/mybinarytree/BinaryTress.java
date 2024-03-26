package mybinarytree;
class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
/**
 * BinaryTress
 */
public class BinaryTress {
    Node root; // root of the binary tree
    public BinaryTress() {
        root = null;
    }

    public BinaryTress(int item) {
        root = new Node(item);
    }

    //print the tree inorder
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    //exercise: implement the preorder and postorder traversal

    public void insertBST(Node root, Node node) {
        if (root == null) {
            root = node;
            return;
        }
        if (node.data < root.data) {
            if (root.left == null) {
                root.left = node;
            } else {
                insertBST(root.left, node);
            }
        } else {
            if (root.right == null) {
                root.right = node;
            } else {
                insertBST(root.right, node);
            }
        }        
    }
    
    public void searchBST(Node root, int key) {
        if (root == null) {
            System.out.println("\nKey not found");
            return;
        }
        if (root.data == key) {
            System.out.println("\nKey found");
            return;
        }
        if (key < root.data) {
            searchBST(root.left, key);
        } else {
            searchBST(root.right, key);
        }
    }   

    public static void main(String[] args) {
        BinaryTress tree = new BinaryTress();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inorder(tree.root);

        BinaryTress bst = new BinaryTress();
        bst.root = new Node(25);

        bst.insertBST(bst.root, new Node(30));
        bst.insertBST(bst.root, new Node(20));
        bst.insertBST(bst.root, new Node(40));

        
        System.out.println("\nInorder traversal of BINARY SEARCH TREE is ");
        bst.inorder(bst.root);

        bst.searchBST(bst.root, 30);
        bst.searchBST(bst.root, 50);
    }

    
}