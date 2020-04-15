public class TeenNumberChecker {
    public static boolean isTeen(int teenValue){

        return teenValue>= 13 && teenValue <=19;
    }

    public static boolean hasTeen(int firstAge, int secAge, int thirdAge) {
      return isTeen(firstAge) || isTeen(secAge) || isTeen(thirdAge);
    }
}
