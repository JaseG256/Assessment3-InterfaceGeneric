package com.zipcoder.assessment3.part1;

import java.lang.reflect.Array;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object object : objectArray) {
            if (object.equals(objectToCount)) {
                count ++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] tempArray = new Object[objectArray.length];
        Object[] arrayWithRemoved = new Object[objectArray.length - 1];
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
            }
        }
        return null;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;
        Object mostCommonElement = objectArray[0];
        Object temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp.equals(objectArray[j]))
                    tempCount++;
            }
            if (tempCount > count) {
                mostCommonElement = temp;
                count = tempCount;
            }
        }
        return mostCommonElement;
    }

    public static int countOccurence(Object[] array, Object object) {
        int count = 0;
        for (Object o : array) {
            if (o.equals(object)) {
                count ++;
            }
        }
        return count;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;
        Object leastCommonElement = objectArray[0];
        Object temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp.equals(objectArray[j]))
                    tempCount++;
            }
            if (tempCount < count) {
                leastCommonElement = temp;
                count = tempCount;
            }
        }
        return leastCommonElement;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] mergedArray = new Integer[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, mergedArray, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, mergedArray, objectArray.length, objectArrayToAdd.length);
        return mergedArray;
    }
}
