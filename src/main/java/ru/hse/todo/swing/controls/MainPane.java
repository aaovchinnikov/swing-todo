package ru.hse.todo.swing.controls;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ru.hse.todo.swing.listeners.OpenLabeledPane;

public final class MainPane implements ContentPane {
	private final JPanel panel;
	private final GridBagLayout gbl;
	private final GridBagConstraints gbc;
	private final boolean enabled;

	// Seems to be secure, because all fields are final
	private MainPane(MainPane pane) {
		this.panel = pane.panel;
		this.gbl = pane.gbl;
		this.gbc = pane.gbc;
		this.enabled = pane.enabled;
	}
	
	/**
	 * @param enabled
	 */
	public MainPane(boolean enabled, MainWindow window) {
		this.enabled = enabled;
		this.gbl = new GridBagLayout();
		this.gbl.columnWeights = new double[]{1.0};
		this.gbl.rowWeights = new double[]{1.0};
		this.gbc = new GridBagConstraints();
		this.gbc.fill = GridBagConstraints.BOTH;
		final JButton button = new JButton();
		button.addActionListener(new OpenLabeledPane(window));
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
	
	public void tmp() {
		
	}
	
	protected MainPane clone() {
		
		return null;
	}
}
