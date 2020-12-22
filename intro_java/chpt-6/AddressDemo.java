public class AddressDemo {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House("my address", -1200, -25000, -60000, -4, -2.5);

        System.out.println(house1.toString());
        System.out.println(house2.toString());
    }// end main
}// end class
    