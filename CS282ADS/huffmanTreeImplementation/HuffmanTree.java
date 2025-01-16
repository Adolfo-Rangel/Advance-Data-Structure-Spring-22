package Huffmancode;

import java.util.Scanner;

public class HuffmanTree {
    private Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text message:");
        String message = scanner.nextLine();


        int[] frequency = new int[256];
        for (char character : message.toCharArray()) {
            frequency[character]++;
        }


        PriorityQ queue = new PriorityQ(256);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                char character = (char) i;
                Node node = new Node(character, frequency[i]);
                queue.insert(node);
            }
        }


        while (queue.size() > 1) {
            Node left = queue.remove();
            Node right = queue.remove();
            Node parent = new Node(left.freq + right.freq, left, right);
            queue.insert(parent);
        }


        Node root = queue.peekMin();
        String[] codes = new String[256];
        encode(root, "", codes);


        String encodedMessage = "";
        for (char character : message.toCharArray()) {
            encodedMessage += codes[character];
        }


        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                char character = (char) i;
                System.out.println("'" + character + "': " + codes[i]);
            }
        }


        String decodedMessage = decode(encodedMessage, root);
        System.out.println("Encoded message into binary: " + encodedMessage);
        System.out.println("Original message: " + decodedMessage);
    }

    private static String encode(Node node, String code, String[] codes) {
        if (node.isLeaf()) {
            codes[node.character] = code;
        } else {
            encode(node.left, code + "0", codes);
            encode(node.right, code + "1", codes);
        }
        return code;
    }

    public static String encode(String message, String[] codes) {
        String encodedMessage = "";
        for (char character : message.toCharArray()) {
            encodedMessage += codes[character];
        }
        return encodedMessage;
    }

    public static String decode(String encodedMessage, Node root) {
        String decodedMessage = "";
        Node current = root;
        for (int i = 0; i < encodedMessage.length(); i++) {
            char character = encodedMessage.charAt(i);
            if (character == '0') {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current.isLeaf()) {
                decodedMessage += current.character;
                current = root;
            }
        }
        return decodedMessage;
    }
}
