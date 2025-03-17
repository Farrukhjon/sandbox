package io.github.farrukhjon.experiment.java.arrays;



import static java.lang.System.arraycopy;

public class UnionTwoArrays {

    public String[] union(final String[] firstArray, final String[] secondArray) {
        int lengthOfFirstArray = firstArray.length;
        int lengthOfSecondArray = secondArray.length;
        int lengthOfUnionisedArray = lengthOfFirstArray + lengthOfSecondArray;
        String[] unionisedArray = new String[lengthOfUnionisedArray];
        arraycopy(firstArray, 0, unionisedArray, 0, lengthOfFirstArray);
        arraycopy(secondArray, 0, unionisedArray, lengthOfFirstArray, lengthOfSecondArray);
        return unionisedArray;
    }

    public static void main(String[] args) {
        String[] a1 = {"C", "F", "D", "E", "F", "C", "C", "D", "E"};
        String[] a2 = {"A", "X"};
        UnionTwoArrays unionTwoArrays = new UnionTwoArrays();
        String[] union = unionTwoArrays.union(a1, a2);
        for (String s : union) {
            System.out.println(s);
        }
    }

}
