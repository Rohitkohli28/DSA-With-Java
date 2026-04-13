import java.util.Scanner;

// Step 1: Create a node
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class TreeExample1 {

    static Scanner scanner = new Scanner(System.in);

    static TreeNode buildTree() {
        System.out.println("Enter the Data of Node:");
        int data = scanner.nextInt();

        // Base condition
        if (data == -1) {
            return null;
        }

        TreeNode node = new TreeNode(data);

        System.out.println(data + ": Create Left Node");
        node.left = buildTree();

        System.out.println(data + ": Create Right Node");
        node.right = buildTree();

        return node;
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println("Tree Created Successfully!");
    }
}