package io.github.farrukhjon.experiment.java.bitwise;

public class BinaryLiteralsDemo {

	public static void main(String[] args) {

		int a = 0b11111111; // decimal 255 in binary literal
		int b = 0b00000000; // decimal 0 in binary literal
		int c = 0xff;		// decimal 255 in hex literal
		int d = 0377;		// decimal 255 in octal literal

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
