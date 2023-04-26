package example.project.Refactoring;

public class ExtractMethods {

    /**
     * This is a method to reengineer using `extract methods` refactoring technique.
     * TODO: complete `foo_after_refactoring()` method below using the refactoring.
     */
    public static void foo_before_refactoring() {
        // initialise an array of random numbers with the size of 10
        // print the array with a given delimiter
        // initialise another array of random numbers with the size of 10
        // print the array with a given delimiter
    }

    public static void foo_after_refactoring() {
        // TODO: uncomment the following lines and complete missing methods

        // initialise an array of random numbers with the size of 10
        int[] array1 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array1, " ");

        // initialise another array of random numbers with the size of 10
        int[] array2 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array2, " ");
    }

    public static int[] initialiseArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static <T> void printArrayWithDelimiter(int[] array, String delimiter){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + delimiter);
        }
        System.out.println();
    }
}
