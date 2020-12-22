public class TestDoor_DL {
    public static void main(String[] args) {

    //The "Enter" door should be unlocked and opened.
    
        Door Enter = new Door();
        System.out.println(Enter.isClosed());
        System.out.println(Enter.isLocked());

        //The "Exit" door should be closed and locked.
        Door Exit = new Door();
        Exit.close();
        Exit.lock();
        System.out.println(Exit.isClosed());
        System.out.println(Exit.isLocked());

        //The "Treasure" door should be open but locked.
        Door Treasure = new Door();
        Treasure.lock();
        System.out.println(Treasure.isClosed());
        System.out.println(Treasure.isLocked());

 
    }//end main
}//end class
