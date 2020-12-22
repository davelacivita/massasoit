public class Door {
    
    // Door(); //Constructor - initializes a Door with 
    //inscription "unknown", open and unlocked
    // Door(String c); //Constructor - initializes a Door 
    //with inscription c, closed and locked
    // isClosed(); //Returns true if the 
   // Door is closed, false if it is not
    // isLocked(); //Returns true if the 
    //Door is locked, false if it is not
    // open(): //Opens a Door if it is closed and unlocked
    // close(); //Closes a Door if it is open
    // lock(); //Locks a Door if it is unlocked
    // unlock(); // Unlocks a Door if it is locked

    public final String inscription;
    public boolean locked;
    public boolean closed;

    //default constructor
    public Door() {
        inscription = "unknown";
        locked = false;
        closed = false;
    }

    //non-default
    public Door(String c) {
        inscription = c;
        locked = true;
        closed = true;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public void open() {
        if (this.closed == true && this.locked == false) {
            this.closed = false;
        }
        else {
            System.out.println("Sorry, this door is closed and locked.");
        }
    }

    public void close() {
        if (this.closed == false) {
            this.closed = true;
        }
        else {
            System.out.println("Sorry, this door is already closed.");
        }
    }

    public void lock() {
        if (this.locked == false) {
            this.locked = true;
        }
        else {
            System.out.println("Sorry, this door is already locked.");
        }
    }

    public void unlock() {
        if (this.locked == true) {
            this.locked = false;
        }
        else {
            System.out.println("Sorry, this door is aready unlocked");
        }
    }
   

}//end class
