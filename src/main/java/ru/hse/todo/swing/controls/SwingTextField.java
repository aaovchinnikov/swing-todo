package ru.hse.todo.swing.controls;

import javax.swing.JPanel;
import javax.swing.JTextField;

public final class SwingTextField implements SwingControl {
	private final JTextField field;

	/**
	 * @param field
	 */
	private SwingTextField(JTextField field) {
		this.field = field;
	};

	public SwingTextField() {
		this(new JTextField());
	}

	@Override
	public SwingTextField withParent(JPanel parent, Object constraints) {
		final JTextField field = new JTextField();
		parent.add(field, constraints);
		return new SwingTextField(field);
	}
}
