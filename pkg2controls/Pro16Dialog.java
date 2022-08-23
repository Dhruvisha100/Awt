package com.pkg2controls;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pro16Dialog {

	private static Dialog d;

	Pro16Dialog() {
		Frame f = new Frame();
		d = new Dialog(f, "Dialog Example", true);
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pro16Dialog.d.setVisible(false);
			}
		});
		d.add(new Label("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}

	public static void main(String args[]) {
		new Pro16Dialog();
	}
}
