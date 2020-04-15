public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.5));
        System.out.println(AreaCalculator.area(0.0, 0.0));
        System.out.println("");

        MinutesToYearsDaysCalculator.printYearsAndDays(-526000);
        System.out.println("");

        EqualityPrinter.printEqual(4, 6, 2);
        EqualityPrinter.printEqual(2, 2, 2);
        EqualityPrinter.printEqual(-2, 0, 5);
        EqualityPrinter.printEqual(2, 3, 2);

        System.out.println("");
        System.out.println("Is cat playing? " + PlayingCat.isCatPlaying(true, 50));
    }
}
