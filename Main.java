public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook one = new AppointmentBook(schedule);
        AppointmentBook two = new AppointmentBook(schedule);

        for (int i = 0; i < 15; i++) {
            schedule[1][i] = true;
        }

        one.PrintPeriod(2);

        two.printPeriod(4);
        System.out.println(two.makeAppoitment(2, 4, 22));
        two.printPeriod(4);
    }
}
