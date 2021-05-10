public class Duck {
    private String name;
    private Duck next;
    private Duck previous;

    public Duck() {
        name = "";
        next = null;
        previous = null;

    }//end constructor

    public Duck(String s, Duck pDuck, Duck nDuck) {
        name = s;
        setNext(nDuck);
        setPrevious(pDuck);

    }

    //getters

    public String getName() {
        return this.name;
    }
        
    public Duck getNext() {
        return this.next;
    
    }

    public Duck getPrevious() {
        return this.previous;
    }

    //setters

    public void setName(String sPassed) {
        this.name = sPassed;
    }

    public void setNext(Duck rDuck) {
        this.next = next;
    }

    public void setPrevious(Duck pDuck) {
        this.previous = previous;
    }

    public String toString() {
        return 
        "\n" + this.name;
    }

    public Boolean equals(Duck duckPassed) {
        return
        this.name.equals(duckPassed) && 
        this.previous == duckPassed.getPrevious() &&
        this.next == duckPassed.getNext();
    }


}//end class
