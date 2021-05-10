public class Node {
    private String description;
    private Node link;

    public Node() {
        description = null;
        link = null;
    }// end constructor

    public Node(String newDescription, Node linkValue) {
        description = newDescription;
        link = linkValue;
    }// end constructor
    
}//end class
