public class DemoNode {
    public static void main(String[] args) {
        Node p = new Node("Mecury");
        Node q = p;

        Node r = new Node("Venus");
        q.next = r;
        q = r;
        
        r = new Node("Earth");
        q.next = r;
        q = r;

        r = new Node("Mars");
        q.next = r;
        q = r;

        r = new Node("Jupiter");
        q.next = r;
        q = r;

        r = new Node("Satrun");
        q.next = r;
        q = r;

        r = new Node("Uranus");
        q.next = r;
        q = r;

        r = new Node("Neptune");
        q.next = r;
        q = r;

        r = new Node("Pluto");
        q.next = r;
        q = r;

        Node n = p;
        while (n != null) {
        System.out.println(n.data);
        //System.out.println(n);
        n = n.next;
        }//end while

    }//end main

}//end class
