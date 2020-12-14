public class DemoAppointment {
    public static void main(String[] args) {
        Appointment a1 = new Appointment();
        Appointment a2 = new Appointment("December", 14, 2020, 11, 30);
        System.out.println(a2);
        System.out.println(a1);
    }
}
