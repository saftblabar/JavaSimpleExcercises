public class Main {

    //Display even numbers using method isEven
    // Display only 5 even numbers

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEven(number)) {
                continue;
            }
            System.out.println("Even number: " + number);

            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("Even numbers found: " + count);
    }

    public static boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
