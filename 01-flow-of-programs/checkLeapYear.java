/*
Reference: https://www.quora.com/Why-are-centuries-in-the-Gregorian-calendar-divided-by-400-to-find-out-if-the-year-is-a-leap-year/answer/Shiva-Bala-Rakavi
*/

public class checkLeapYear {
    public static void main(String[] args) {
        int year = 1600;
        checkifLeapYear(year);
    }

    static void checkifLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            // check if the year is century
            if (year % 100 == 0) {
                // check if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    isLeapYear = true;
            }
            // if the year is not century
            else
                isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
