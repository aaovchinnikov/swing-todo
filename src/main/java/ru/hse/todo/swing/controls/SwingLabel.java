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
	private final String text;

	/**
	 * Private constructor to be used in {@link #withParent(JPanel)} method
	 * 
	 * @param label
	 */
	private SwingLabel(JLabel label, String text) {
		this.label = label;
		this.text = text;
	}

	/**
	 * @param label
	 */
	public SwingLabel(String text) {
		this(new JLabel(text), text);
	}

	@Override
	public SwingLabel withParent(JPanel parent, Object constraints) {
		final JLabel jLabel = new JLabel(this.text);
		parent.add(jLabel, constraints);
		return new SwingLabel(jLabel, this.text);
	}
}
