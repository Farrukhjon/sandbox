package io.github.farrukhjon.experiment.java.math;

import javax.swing.*;
import java.awt.*;

public class MAXMIN {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setLayout(new BorderLayout());
		int value = minmax(10, 10);
		System.out.println(value);
	}

	private static int minmax(int a, int b) {
		if (a > b)
			return a;
		else if (a < b)
			return b;
		else
			return 0;
	}

}
