public class Main {
    public static void main(String[] args) {

       int count = 0;
       int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 ==0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Number divisible by both 3 and 5: " + i);
            }
            if (count == 5) {
                break;
            }
        }
        //printing sum of found numbers:
        System.out.println("Sum of found numbers: " +sum);

        //excercise 2:
        System.out.println("The sum of odd numbers between given parameters: "
                + excercise2.sumOdd(1, 100));
    }
}
