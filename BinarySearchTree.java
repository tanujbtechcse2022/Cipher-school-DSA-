class BinarySearchTree
{
    /* Class containing left and right child of current node and key value*/
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;
    
        // Constructor
        BinarySearchTree() {
            root = null;
        }
    
        // Insert a new key into the BST
        void insert(int key) {
            root = insertRec(root, key);
        }
    
        // Recursive helper method to insert a key in the BST
        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key) {
                root.left = insertRec(root.left, key);
            } else if (key > root.key) {
                root.right = insertRec(root.right, key);
            }
            return root;
        }
    
        // Delete a key from the BST
        void deleteKey(int key) {
            root = deleteRec(root, key);
        }
    
        // Recursive helper method to delete a key from the BST
        Node deleteRec(Node root, int key) {
            if (root == null) return root;
    
            if (key < root.key) {
                root.left = deleteRec(root.left, key);
            } else if (key > root.key) {
                root.right = deleteRec(root.right, key);
            } else {
                if (root.left == null) return root.right;
                else if (root.right == null) return root.left;
    
                root.key = minValue(root.right);
                root.right = deleteRec(root.right, root.key);
            }
            return root;
        }
    
        // Helper method to find the minimum value node in a subtree
        int minValue(Node root) {
            int minv = root.key;
            while (root.left != null) {
                minv = root.left.key;
                root = root.left;
            }
            return minv;
        }
    
        // Search for a key in the BST
        boolean search(int key) {
            return searchRec(root, key) != null;
        }
    
        // Recursive helper method to search for a key in the BST
        Node searchRec(Node root, int key) {
            if (root == null || root.key == key) {
                return root;
            }
            if (root.key > key) {
                return searchRec(root.left, key);
            }
            return searchRec(root.right, key);
        }
    
        // InOrder Traversal
        void inorder() {
            inorderRec(root);
        }
    
        // A utility function to do inorder traversal of BST
        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
    
        // Driver Program to test above functions
        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
    
            /* Let us create following BST
                      50
                   /     \
                  30      70
                 /  \    /  \
                20   40  60   80 */
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);
    
            System.out.println("Inorder traversal of the given tree");
            tree.inorder();
    
            System.out.println("\n\nDelete 20");
            tree.deleteKey(20);
            System.out.println("Inorder traversal of the modified tree");
            tree.inorder();
    
            System.out.println("\n\nDelete 30");
            tree.deleteKey(30);
            System.out.println("Inorder traversal of the modified tree");
            tree.inorder();
    
            System.out.println("\n\nDelete 50");
            tree.deleteKey(50);
            System.out.println("Inorder traversal of the modified tree");
            tree.inorder();
    
            System.out.println("\n\nSearch for 80");
            System.out.println(tree.search(80) ? "Found" : "Not Found");
    
            System.out.println("\n\nSearch for 100");
            System.out.println(tree.search(100) ? "Found" : "Not Found");
        }
    }
    
