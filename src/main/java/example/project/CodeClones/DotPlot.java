package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays
        int rows = sequence1.length;
        int cols = sequence2.length;

        // Print the first row with sequence2 elements
        System.out.print("\t");
        for (char c : sequence2) {
            System.out.print(c + "\t");
        }
        System.out.println();

        // Print the rest of the rows with sequence1 elements
        for (int i = 0; i < rows; i++) {
            System.out.print(sequence1[i] + "\t");
            for (int j = 0; j < cols; j++) {
                if (sequence1[i] == sequence2[j]) {
                    System.out.print("+\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
