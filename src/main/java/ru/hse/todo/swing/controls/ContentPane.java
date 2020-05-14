package ru.hse.todo.swing.controls;

import javax.swing.JFrame;

public interface ContentPane {
	/**
	 * @implSpec Supposed implementation is
	 * <pre>
	 * public void bind(JFrame parent) {
	 * 	parent.setContentPane(this.panel);
	 * }
	 * </pre>
	 * @param parent
	 */
	void bind(JFrame parent);
}
