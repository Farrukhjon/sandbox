package io.github.farrukhjon.experiment.java.io.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingDirectlyFromURL {

  public void shouldReadingFileDirectlyFromURL() throws IOException {
    URL url = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    String line;
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    reader.close();
  }
}
