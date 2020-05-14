package ru.hse.todo.swing.controls;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ru.hse.todo.swing.listeners.ToggleField;

public final class MainWindow {
	private final JFrame jFrame;
	private final GridBagLayout gbl;
	private final GridBagConstraints gbc;

	public MainWindow() {
		this.gbl = new GridBagLayout();
		this.gbl.columnWeights = new double[]{1.0};
		this.gbl.rowWeights = new double[]{1.0};
		this.gbc = new GridBagConstraints();
		this.gbc.fill = GridBagConstraints.BOTH;
		this.jFrame = new JFrame();
		this.jFrame.setTitle("TODO App");
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setMinimumSize(new Dimension(320, 270));
		this.jFrame.pack();
		this.jFrame.setLocationRelativeTo(null);
	}
	
	public void show() {
		rebuildUI(false);
		this.jFrame.setVisible(true);
	}
	
	public void rebuildUI(boolean fieldEnabled) {
		final JButton button = new JButton();
		button.addActionListener(new ToggleField(this, fieldEnabled));
		final JTextField field = new JTextField();
		field.setEnabled(fieldEnabled);
		// FIXME Temporal coupling
		final JPanel panel = new JPanel();
		panel.setLayout(this.gbl);
		panel.add(field, this.gbc);
		panel.add(button, this.gbc);
		this.jFrame.setContentPane(panel);
		this.jFrame.validate();
	}
}
