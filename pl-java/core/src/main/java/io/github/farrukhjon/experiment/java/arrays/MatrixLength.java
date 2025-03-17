package io.github.farrukhjon.experiment.java.arrays;
public class MatrixLength {

	public static void main(String[] args) {

		int[][] intMatrix = {
			{0, 0, 0},
			{1, 2, 3},
			{3, 4, 5},
			{1, 2, 0}
		};

		int rowCount = intMatrix.length;
		int columnCount = intMatrix[0].length;

		System.out.printf("Row count of int matrix: %s %n", rowCount);
		System.out.printf("Colum count of int matrix: %s %n", columnCount);
	}

}
