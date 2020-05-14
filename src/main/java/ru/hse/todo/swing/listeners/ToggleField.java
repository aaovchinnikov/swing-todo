package ru.hse.todo.swing.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ru.hse.todo.swing.controls.MainPane;
import ru.hse.todo.swing.controls.MainWindow;

public final class ToggleField implements ActionListener {
	private final boolean enabled;
	private final MainWindow window;
	
	/**
	 * @param enabled
	 * @param window
	 */
	public ToggleField(MainWindow window, boolean enabled) {
		this.enabled = enabled;
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.window.rebuildUI(new MainPane(!this.enabled, this.window));
	}
}
