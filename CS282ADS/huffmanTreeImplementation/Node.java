package Huffmancode;

public class Node implements  Comparable<Node> {
    //node will contain data, freg, left and right;
    char character;
    public int freq;
    Node left;
    Node right;

    public Node(char character, int freq) {
        this.character = character;
        this.freq = freq;
    }

    public Node(int freq, Node left, Node right) {
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return this.freq - other.freq;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }
}
