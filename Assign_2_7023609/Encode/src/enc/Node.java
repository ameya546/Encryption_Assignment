package enc;

public class Node implements Comparable<Node>{

    public String label;
    public int frequency;
    public Node leftChild;
    public Node rightChild;

    public Node(String label, int frequency){
        this.label = label;
    }

    public int compareTo(Node other) {
        return 0;
    }
}