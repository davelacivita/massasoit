public class DemoAppointment {
    public static void main(String[] args) {
        Appointment a1 = new Appointment();
        Appointment a2 = new Appointment("May", 14, 2020, 11, 30);
        Appointment a3 = new Appointment("Pluto", 99, -10, 46, 103);
     
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }//end main
}// end class
