import java.util.Arrays;

public class SubInt {

    public static int[] subInt(int part, int[] arr) {

        int newArrSize = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Integer.toString(arr[i]).contains(Integer.toString(part)) == true) {
                newArrSize = newArrSize + 1;
            }
        }

        int[] returnArray = new int[newArrSize];

        for (int i = 0; i < arr.length; i++) {
            if (Integer.toString(arr[i]).contains(Integer.toString(part)) == true) { // needs a freakin' debug...
                returnArray = Arrays.copyOf(returnArray, returnArray.length + 1);
                returnArray[returnArray.length - 1] = i;
            }
        }

        return returnArray;
    }

    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function as a way to print
        // array returned from subInt(). You could just as well iterate over array to print it.
    }
}
