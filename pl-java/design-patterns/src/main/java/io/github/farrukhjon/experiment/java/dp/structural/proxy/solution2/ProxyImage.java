package io.github.farrukhjon.experiment.java.dp.structural.proxy.solution2;

/**
 * @author    Farrukhjon SATTOROV
 */
public class ProxyImage implements IImage {

	/**
	 * @uml.property  name="realImage"
	 * @uml.associationEnd
	 */
	private RealImage	realImage	= null;
	private String		fileName	= null;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void drawImage() {
		if (realImage == null)
			realImage = new RealImage(fileName);
		realImage.drawImage();
	}

}
