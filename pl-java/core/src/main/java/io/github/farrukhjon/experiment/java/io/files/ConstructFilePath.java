package io.github.farrukhjon.experiment.java.io.files;

import java.io.File;

public class ConstructFilePath {

	public static void main(String[] args) {
		String filePath = File.separator + "Java" + File.separator + "IO";
		File file = new File(filePath);
		System.out.println(file.getPath());
	}
}
