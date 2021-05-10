public class NodeDemo {
    private String description;
    private NodeDemo link;
    private Node NodeDemo;

    public NodeDemo() {
        description = null;
        link = null;
    }// end constructor

    public NodeDemo(String newDescription, NodeDemo linkValue) {
        description = newDescription;
        link = linkValue;
    }// end constructor

    public String getDesciption() {
        return this.description;
    }

    public Node getNode() {
        return this.NodeDemo;
    }

    public void setLink(NodeDemo linkpassed) {
        this.link = linkpassed;
    }

    public void setDescription(NodeDemo descriptionPassed) {
        this.link = descriptionPassed;
    }

    public NodeDemo getLink() {
        return null;
    }

}// end class
