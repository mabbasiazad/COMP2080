class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTrees {
    Node root;

    BinaryTrees(int data) {
        root = new Node(data);
    }

    Node insertRec(Node root, int data) {
        //System.out.println("Inserting data: " + data);
        
        if (root == null) {
            root = new Node(data);
            //System.out.println("Created new node with data: " + data);
            return root;
        } 
        
        if (data < root.data) {
            //System.out.println("Going left from node with data: " + root.data);
            root.left = insertRec(root.left, data);
        } else {
            //System.out.println("Going right from node with data: " + root.data);
            root.right = insertRec(root.right, data);
        }        
        
        //System.out.println("Returning from node with data: " + root.data);
        return root;
    }

    void searchRec(Node root, int data) {
        if (root == null) {
            System.out.println("Data not found");
            return;
        }

        if (root.data == data) {
            System.out.println("Data found");
            return;
        }

        if (data < root.data) {
            searchRec(root.left, data);
        } else {
            searchRec(root.right, data);
        }
    }

    void inorderRec(Node root) {
        if (root == null) {
            return;
        }

        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }

    void inorder(Node root) {
        inorderRec(root);
        System.out.println(); // Go to the next line
    }

    Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees(50);
        tree.insertRec(tree.root, 30);
        tree.insertRec(tree.root, 20);        
        tree.insertRec(tree.root, 40);
        tree.insertRec(tree.root, 70);
        tree.insertRec(tree.root, 60);
        tree.insertRec(tree.root, 80);

        tree.inorder(tree.root);

        tree.searchRec(tree.root, 40);
        tree.searchRec(tree.root, 100);
    }
}