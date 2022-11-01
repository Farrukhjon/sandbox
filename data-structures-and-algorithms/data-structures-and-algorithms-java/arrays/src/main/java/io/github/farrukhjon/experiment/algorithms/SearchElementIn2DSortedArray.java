package io.github.farrukhjon.experiment.algorithms;

public class SearchElementIn2DSortedArray {

    public static void main(String[] args) {
        int[][] intTwoDIntArray = {
                {1, 2, 3},
                {7, 9, 10},
                {15, 20, 77},
                {78, 81, 99}
        };

        int valueToSearch = 99;
        int[] foundCell = find(intTwoDIntArray, valueToSearch);
        if (foundCell.length == 2)
            System.out.printf("Value %s found at row=%s and column=%s in the 2d int array", valueToSearch, foundCell[0], foundCell[1]);
        else
            System.out.printf("Value %s was not found!", valueToSearch);
    }

    private static int[] find(int[][] twoDIntArray, int valueToSearch) {
        int rows = twoDIntArray.length;
        int columns = twoDIntArray[0].length;
        int firstIndex = 0;
        int lastIndex = rows * columns - 1;

        while (firstIndex <= lastIndex) {
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;
            int rowIndex = midIndex / columns;
            int columnIndex = midIndex % columns;
            int valuePicked = twoDIntArray[rowIndex][columnIndex];

            if (valuePicked == valueToSearch)
                return new int[]{rowIndex, columnIndex};
            if (valuePicked > valueToSearch)
                lastIndex = midIndex - 1;
            else
                firstIndex = midIndex + 1;
        }
        return new int[]{};
    }
}
