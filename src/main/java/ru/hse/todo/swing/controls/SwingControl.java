package ru.hse.todo.swing.controls;

import javax.swing.JPanel;

public interface SwingControl {
	/**
	 * Creates copy of current control and adds its internal Swing
	 * object to provided Swing <code>parent</code> with provided layout <code>constraints</code>.
	 * 
	 * @param parent
	 * @param constraints
	 * @return copy of current control, added to parent {@link JPanel}.
	 */
	SwingControl withParent(JPanel parent, Object constraints);
}
