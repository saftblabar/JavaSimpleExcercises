package com.udemy;

public class Main {

    public static void main(String[] args) {
        Day.printDayOfTheWeek(5);
        Day.printDayOfTheWeek(-2);

        Day.printDayIfElse(4);
        Day.printDayIfElse(33);

        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(-3);
        NumberInWord.printNumberInWord(16);

        System.out.println(  NumberOfDaysInMonth.isLeapYear(2013));
        System.out.println( NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, -1900));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(5, 2010));
    }
}
