package ru.hse.todo.swing.controls;

import javax.swing.JFrame;

public interface ContentPane {
	
	
	/**
	 * Binds content pane to {@link JFrame}. Supposed implementation is
	 * <pre>
	 * private final JPanel panel;
	 * 
	 * public void bind(JFrame parent) {
	 * 	parent.setContentPane(this.panel);
	 * }
	 * </pre>
	 * @param parent
	 */
	void bind(JFrame parent);
}
