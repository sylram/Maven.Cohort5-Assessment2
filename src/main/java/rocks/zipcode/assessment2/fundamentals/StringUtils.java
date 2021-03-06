package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {

    public static String calculateSpace(String s1, int space){
        int amountOfSpace = space - s1.length();
        String padLeft = "";
        for (int i = 0; i < amountOfSpace; i++) {
            padLeft += (" ");
        }return padLeft ;

    }
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return calculateSpace(stringToBePadded,amountOfPadding)+stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return stringToBePadded + calculateSpace(stringToBePadded,amountOfPadding);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            repeated += stringToBeRepeated;

        }
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String y= string.replace(" ","");
        for (char x : y.toCharArray()) {
            if (!Character.isAlphabetic(x)) {
                return false;
            }



        }
        return true;

    }



        /**
         * @param string - string to be evaluated
         * @return - true if string only contains numeric characters
         */
    public static Boolean isNumericString(String string) {
        for (char n : string.toCharArray()) {
            if (!Character.isDigit(n)) {
                return false;
            }

        }
        return true;


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        for (char x : string.toCharArray()) {
            if (Character.isLetterOrDigit(x)) {
                return false;
            }
        }
        return true;

    }
}
