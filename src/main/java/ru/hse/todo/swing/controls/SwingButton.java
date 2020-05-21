package ru.hse.todo.swing.controls;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public final class SwingButton implements SwingControl {
	private final String text;
	private final JButton button;
	private final ActionListener listener;
	
	/**
	 * @param text
	 */
	private SwingButton(JButton button, String text, ActionListener listener) {
		this.button = button;
		this.text = text;
		this.listener = listener;
		this.button.addActionListener(this.listener);
	}

	/**
	 * @param button
	 * @param listener
	 */
	public SwingButton(String text, ActionListener listener) {
		this(new JButton(text), text, listener);
	}

	@Override
	public SwingButton withParent(JPanel parent, Object constraints) {
		final JButton button = new JButton(this.text);
		parent.add(button, constraints);
		return new SwingButton(button, this.text, this.listener);
	}

}
