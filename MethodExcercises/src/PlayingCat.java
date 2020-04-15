/*
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

Write a method isCatPlaying that has 2 parameters.
Method needs to return true if the cat is playing, otherwise return false.
 */

public class PlayingCat {
    public static boolean isCatPlaying ( boolean summer, int celsius) {
        if (summer && celsius >=25 && celsius <=45) {
            return true;
        } else if (celsius >= 25 && celsius <= 35) {
            return true;
        } return false;
    }
}
