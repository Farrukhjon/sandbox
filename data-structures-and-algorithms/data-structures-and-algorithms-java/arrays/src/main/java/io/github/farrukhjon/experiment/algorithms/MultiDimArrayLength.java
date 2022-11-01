package io.github.farrukhjon.experiment.algorithms;
public class MultiDimArrayLength {

	public static void main(String[] args) {

		int[][][] multiDimArr = new int[3][4][5];

		int rowCount = multiDimArr.length;
		int columnCount = multiDimArr[0].length;
		int zetRowCount = multiDimArr[0][0].length;

		System.out.printf("Row count of int matrix: %s %n", rowCount);
		System.out.printf("Colum count of int matrix: %s %n", columnCount);
		System.out.printf("ZetRowCount count of int matrix: %s %n", zetRowCount);
	}

}
