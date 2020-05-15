package ru.hse.todo.swing.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ru.hse.todo.swing.controls.LabledPane;
import ru.hse.todo.swing.controls.MainWindow;

public final class OpenLabeledPane implements ActionListener {
	private final MainWindow window;
	
	/**
	 * @param window
	 */
	public OpenLabeledPane(MainWindow window) {
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.window.rebuildUI(new LabledPane("Ololo", this.window));
	}
}
