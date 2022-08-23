package com.pkg2controls;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Pro1Button {

	Frame fObj;
	Button button1, button2, button3;

	Pro1Button() {
		fObj = new Frame("Frame to display buttons");
		button1 = new Button();
		button2 = new Button("Click here");
		button3 = new Button();
		button3.setLabel("Button 3");
		fObj.add(button1);
		fObj.add(button2);
		fObj.add(button3);
		fObj.setLayout(new FlowLayout());
		fObj.setSize(300, 400);
		fObj.setVisible(true);
	}

	public static void main(String[] args) {
 
		new Pro1Button();
	}
}
