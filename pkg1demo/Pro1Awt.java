package com.pkg1demo;

import java.awt.Button;
import java.awt.Frame;

public class Pro1Awt extends Frame{

	Pro1Awt(){
		Button  b = new Button("Click Me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setTitle("Awt Example");
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		Pro1Awt awt = new Pro1Awt();
		System.out.println("Done");
	}
}
