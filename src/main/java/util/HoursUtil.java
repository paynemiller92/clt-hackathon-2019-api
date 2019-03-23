package util;

import model.Clinic;

import java.util.TimeZone;

public class HoursUtil {
    public static boolean isClinicOpen(Clinic clinic) {
        TimeZone.setDefault(TimeZone.getTimeZone("EST"));
        return true;
    }
}
