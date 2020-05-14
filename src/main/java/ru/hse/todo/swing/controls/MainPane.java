package ru.hse.todo.swing.controls;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ru.hse.todo.swing.listeners.ToggleField;

public final class MainPane implements ContentPane {
	private final JPanel panel;
	private final GridBagLayout gbl;
	private final GridBagConstraints gbc;
	private final boolean enabled;
	private final MainWindow window;

	/**
	 * @param enabled
	 */
	public MainPane(boolean enabled, MainWindow window) {
		this.enabled = enabled;
		this.window = window;
		this.gbl = new GridBagLayout();
		this.gbl.columnWeights = new double[]{1.0};
		this.gbl.rowWeights = new double[]{1.0};
		this.gbc = new GridBagConstraints();
		this.gbc.fill = GridBagConstraints.BOTH;
		final JButton button = new JButton();
		button.addActionListener(new ToggleField(this.window, this.enabled));
		final JTextField field = new JTextField();
		field.setEnabled(this.enabled);
		this.panel = new JPanel();
		this.panel.setLayout(this.gbl);
		this.panel.add(field, this.gbc);
		this.panel.add(button, this.gbc);
	}
	
	@Override
	public void bind(JFrame parent) {
		parent.setContentPane(this.panel);
	}
}
