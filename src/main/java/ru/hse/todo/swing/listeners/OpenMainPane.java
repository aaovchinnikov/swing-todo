package ru.hse.todo.swing.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ru.hse.todo.swing.controls.MainPane;
import ru.hse.todo.swing.controls.MainWindow;

public final class OpenMainPane implements ActionListener {
	private final MainWindow window;
	
	/**
	 * @param window
	 */
	public OpenMainPane(MainWindow window) {
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.window.rebuildUI(new MainPane(true, this.window));
	}

}
