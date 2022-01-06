// Write a program to calculate difference between today and your birthday

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class difbetwn_todayndbirthday {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa"); //12 hours format

        Date date = new Date(); //creating date object
        long presentDateTimeStamp = date.getTime(); //Getting timestamp for present date-time

        String birthday = "06-04-1998 02:00:00 PM";
        Date convertedBirthday = sdf.parse(birthday);
        long birthdayTimeStamp = convertedBirthday.getTime(); //Getting timestamp for birthday date-time
        long presentAge = presentDateTimeStamp - birthdayTimeStamp;
        long year = presentAge / (1000l * 365 * 24 * 60 * 60);
        long day = presentAge / (1000l * 24 * 60 * 60) % 365;
        long hour = (presentAge / (1000l * 60 * 60)) % 24;
        long minute = (presentAge / (1000l * 60)) % 60;
        long second = (presentAge / 1000l) % 60;
        System.out.println("Year: " + year);
        System.out.println("Day: " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second " + second);
    }
}
