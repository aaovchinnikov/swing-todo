package ru.hse.todo.swing.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public final class TextField {
	private final JTextField field;
	
	public TextField() {
		this.field = new JTextField();
		this.field.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(field.getText());
			}
		});
	}
}
