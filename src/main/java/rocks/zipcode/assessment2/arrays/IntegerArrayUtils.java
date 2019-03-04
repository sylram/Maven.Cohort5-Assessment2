package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> addedValue= new ArrayList<>(Arrays.asList(integerArray));
        addedValue.add(valueToBeAdded);
        return addedValue.toArray(new Integer[addedValue.size()]);
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        Integer[] replaced = Arrays.copyOf(integerArray,integerArray.length);
        replaced[indexToInsertAt]=valueToBeInserted;
        return replaced;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        ArrayList<Integer> addedValue= new ArrayList<>(Arrays.asList(integerArray));
        int index = addedValue.indexOf(indexToFetch);

        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] incremented = new Integer[integerArray.length];
        for (int i = 0; i <integerArray.length ; i++) {
            if(integerArray[i]%2==0){
                incremented[i] = integerArray[i]+1;
            }else
            incremented[i] = integerArray[i]-1;

        }
        return incremented;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] incremented = new Integer[integerArray.length];
        for (int i = 0; i <integerArray.length ; i++) {
            if (integerArray[i] % 2 == 0) {
                incremented[i] = integerArray[i]+1;
                System.out.println(integerArray[i]);
            }else
               incremented[i]=integerArray[i];
        }return incremented;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] decremented = new Integer[input.length];
        for (int i = 0; i <input.length ; i++) {
            if (input[i] % 2 != 0) {
                decremented[i] = input[i]-1;
                System.out.println(input[i]);
            }else
                decremented[i]=input[i];
        }return decremented;
    }

}
