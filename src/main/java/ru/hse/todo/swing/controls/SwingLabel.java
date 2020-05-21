package ru.hse.todo.swing.controls;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Wraps internal Swing {@link JLabel} object to make it immutable-like. It
 * still accessible through getChildren-like methods on parent.
 * 
 * @author Alexander Ovchinnikov
 *
 */
public final class SwingLabel implements SwingControl {
	private final JLabel label;

	/**
	 * Private constructor to be used in {@link #withParent(JPanel)} method
	 * 
	 * @param label
	 */
	private SwingLabel(JLabel label) {
		this.label = label;
	}

	/**
	 * @param label
	 */
	public SwingLabel(String text) {
		this.label = new JLabel(text);
	}

	@Override
	public SwingLabel withParent(JPanel parent, Object constraints) {
		final JLabel jLabel = new JLabel(this.label.getText());
		parent.add(jLabel, constraints);
		return new SwingLabel(jLabel);
	}
}
