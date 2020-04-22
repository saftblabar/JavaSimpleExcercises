package com.udemy;


public class NumberOfDaysInMonth {

    // calculating what year is a leap year
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999)
            return false;
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        } else return false;

    }
    //telling how many days are in the given month
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                //break?
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 28;
                default:
                    return -1;
            }
        }
    }

}


