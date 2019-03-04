package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        String concatated = string1+string2;
        return concatated;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String[] characters = string1.split("");
        String reversed="";
        for (int i = string1.length()-1; i >=0 ; i--) {
            reversed += characters[i];
        }
        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversedAndConcatanted = concatentate(reverse(string1),reverse(string2));

        return reversedAndConcatanted;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String removed="";
        char[] toChar = charactersToRemove.toCharArray();
        for (int i = 0; i <toChar.length ; i++) {
            removed=string.replace(String.valueOf(toChar[i]),"");
            string=removed;

        }
        return removed;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedandReverse =reverse(removeCharacters(string,charactersToRemove));
        return removedandReverse;
    }
}
