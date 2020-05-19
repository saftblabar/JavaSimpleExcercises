public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
            int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum+= digit;
            System.out.println("Number after modulo: " + number);
            number /= 10;
            System.out.println("Number after dividing by 10: " + number);
        }
        return sum;
    }
}

