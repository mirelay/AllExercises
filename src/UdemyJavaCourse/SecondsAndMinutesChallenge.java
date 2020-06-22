package UdemyJavaCourse;

public class SecondsAndMinutesChallenge {

    public static void main (String[] args) {
       String hourString = getDurationString(61, 44);
       System.out.println(hourString);

       String hourString2 = getDurationString(61);
        System.out.println(hourString2);
    }

    public static String getDurationString (long minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes%60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString (long seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }
        long minutes = seconds/60;
        int remainingSeconds = (int) seconds%60;
        return getDurationString(minutes, remainingSeconds);
    }
}
