/**
 *
 */
package io.github.farrukhjon.experiment.java.io.files.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Farrukhjon SATTOROV, Dec 1, 2014
 *
 */
public class CVSReader {

	public static void main(String[] args) {
		String fileName = args[0];
		String line = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			//Map<String, String> map = new HashMap<>();
			while((line = reader.readLine()) != null){
				String[] shortcuts = line.split(",");
				//map.put(shortcuts[0], shortcuts[1]);
				System.out.println(Arrays.toString(shortcuts));
			}
			//System.out.println(map);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
