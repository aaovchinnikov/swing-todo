package ru.hse.todo.swing.controls;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ru.hse.todo.swing.listeners.OpenMainPane;

public final class LabledPane implements ContentPane {
	private final JPanel panel;
	
	/**
	 * @param text
	 */
	public LabledPane(String text, MainWindow window) {
		final JLabel label = new JLabel(text);
		final JButton button = new JButton();
		button.addActionListener(new OpenMainPane(window));
		this.panel = new JPanel();
		this.panel.setLayout(new GridLayout());
		this.panel.add(label);
		this.panel.add(button);
	}

	@Override
	public void bind(JFrame parent) {
	 	parent.setContentPane(this.panel);
	}
}
