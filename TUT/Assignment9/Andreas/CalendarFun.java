package Assignment9.Andreas;

import java.util.Calendar;

public class CalendarFun {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 6, 1);

        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.MONTH, 3);

        System.out.println(cal.toString());
    }
}
