public class Main {
    public static void main(String[] args) {
        //System.out.println(sumDigits(125));

        // System.out.println(isPalindrome(1221));
        // System.out.println(isPalindrome2(121));
        // System.out.println(sumFirstAndLastDigit(5782));
        // System.out.println(getEvenDigitSum(1234));
        System.out.println(hasSharedDigit(15, 33));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.println("Number after modulo: " + number);
            number /= 10;
            System.out.println("Number after dividing by 10: " + number);
            System.out.println(sum);
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {

        int a = number;


        int reversed = 0;

        while (number != 0) {

            reversed = reversed * 10 + number % 10;
            System.out.println("Reversed: " + reversed);

            number /= 10;
            System.out.println("Number: " + number);
        }


        return a == reversed;

    }

    public static boolean isPalindrome2(int number) {
        // Declaring variables
        int lastDigit;
        int reverseNumber = 0;
        int originalNumber = number;
        // Starting point for checking (reverseNumber = 0)
        while (number != 0) {
            lastDigit = number % 10;
            System.out.println("Extraction of last digit:  " + lastDigit);
            reverseNumber *= 10;
            System.out.println("Increasing the value of reverse number " + reverseNumber);
            reverseNumber += lastDigit;
            System.out.println("Adding the last digit to reverseNumber: " + reverseNumber);
            number /= 10;
            System.out.println("Removing the last digit for the new loop circle: " + number);

        }
        // Returning true or false depending of result
        return originalNumber == reverseNumber;

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstdigit = 0;
        int lastdigit = 0;

        lastdigit = number % 10;
        firstdigit = number;

        while (firstdigit >= 10) {
            firstdigit /= 10;
            System.out.println(firstdigit);
        }

        return firstdigit + lastdigit;
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number != 0) {
            //taking last digit from number
            int digit = number % 10;
            //checking if it's an even number
            if (digit % 2 == 0) {
                //add it to sum if true
                sum += digit;
            }
            //dividing number to get another last digit
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int firstNumber, int secNumber) {

        int temp1, temp2;
        if ((firstNumber < 10 || firstNumber > 99) || (secNumber < 10 || secNumber > 99)) {
            return false;
        } else {
            temp1 = firstNumber % 10;
            firstNumber /= 10;
            temp2 = secNumber % 10;
            secNumber /= 10;
        }
        if ((temp1 == temp2) || (temp1 == secNumber) || (firstNumber == temp2) || (firstNumber == secNumber)) {

            return true;
        }
        return false;
    }
}

