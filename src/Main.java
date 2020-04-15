public class Main {
    public static void main(String[] args) {

        boolean bark = BarkingDog.shouldWakeUp(false, 20);
        System.out.println("Should I wake up? " + bark);

        boolean dec = DecimalComparator.areEqualByThreeDecimalPlaces(3.1234, 3.1237);
        System.out.println("Are equal by three decimal places? " + dec);

        boolean equalSum = EqualSumChecker.hasEqualSum(24, 33, 150);
        System.out.println("Equal sum: " + equalSum);

        boolean ageCheck = TeenNumberChecker.isTeen(3);
        System.out.println("Is teen? " + ageCheck);
        boolean age = TeenNumberChecker.hasTeen(18, 55, 3);
        System.out.println("Is there a teen? " + age);


        SpeedConverter.printConversion(120);
        //SpeedConverter.toMilesPerHour(120);
        System.out.println(SpeedConverter.toMilesPerHour(120));

        System.out.println(SecondsAndMinutes.getDurationString(100, 47));
        System.out.println( SecondsAndMinutes.getDurationString(5877));
    }
}
