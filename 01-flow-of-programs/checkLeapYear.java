public class checkLeapYear {
    public static void main(String[] args) {
        int year = 2000;
        checkifLeapYear(year);
    }

    static void checkifLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}