package com.zipcoder.assessment3.part1;



/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] tempArray = new Integer[ints.length];
        int tempArrayIndex = 0;
        for (Integer in : ints) {
            if (in % 2 != 0) {
                tempArray[tempArrayIndex] = in;
                tempArrayIndex++;
            }
        }
        Integer[] finalArray = new Integer[tempArrayIndex];
        System.arraycopy(tempArray, 0, finalArray , 0, tempArrayIndex);
        return finalArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] tempArray = new Integer[ints.length];
        int tempArrayIndex = 0;
        for (Integer in : ints) {
            if (in % 2 == 0) {
                tempArray[tempArrayIndex] = in;
                tempArrayIndex++;
            }
        }
        Integer[] finalArray = new Integer[tempArrayIndex];
        System.arraycopy(tempArray, 0, finalArray , 0, tempArrayIndex);
        return finalArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] tempArray = new Integer[ints.length];
        int tempArrayIndex = 0;
        for (Integer in : ints) {
            if (in % 3 != 0) {
                tempArray[tempArrayIndex] = in;
                tempArrayIndex++;
            }
        }
        Integer[] finalArray = new Integer[tempArrayIndex];
        System.arraycopy(tempArray, 0, finalArray , 0, tempArrayIndex);
        return finalArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] tempArray = new Integer[ints.length];
        int tempArrayIndex = 0;
        for (Integer in : ints) {
            if (in % multiple != 0) {
                tempArray[tempArrayIndex] = in;
                tempArrayIndex++;
            }
        }
        Integer[] finalArray = new Integer[tempArrayIndex];
        System.arraycopy(tempArray, 0, finalArray , 0, tempArrayIndex);
        return finalArray;
    }
}
