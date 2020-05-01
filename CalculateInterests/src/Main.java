public class Main {

    public static void main(String[] args) {
        System.out.println(CalculateInterests.calculateInterests(3000, 10));
        System.out.println(String.format("%.2f",CalculateInterests.calculateInterests(2743.55, 2.85)));


        //for loop
        for (int i = 5 ; i < 8; i++) {
            System.out.println("For 10000 at "+ i +"% interest = "+String.format("%.2f", CalculateInterests.calculateInterests(10000, i)));

        } System.out.println("");
        for (int i = 5; i < 8; i++) {
            System.out.println("For 10000 at "+ i +"% interest = "+ CalculateInterests.calculateInterests(10000, i));

        }System.out.println("");
        for (int i = 8; i > 5; i--) {
            System.out.println("For 10000 at "+ i +"% interest = "+ CalculateInterests.calculateInterests(10000, i));
        } System.out.println("");


        for (int j = 1000; j <1200 ; j+=100) {
            for (int i = 2; i <6 ; i++) {
                System.out.println("For "+ j +" at "+ i +"% interest = "+ CalculateInterests.calculateInterests(j, i));
            }

        }
    }
}
