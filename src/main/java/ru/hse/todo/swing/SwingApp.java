package ru.hse.todo.swing;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

import ru.hse.todo.swing.controls.MainWindow;

public final class SwingApp {
	private final MainWindow window;
	private final LookAndFeel laf;

	/**
	 * Creates application with default Metal L&F used.
	 */
	public SwingApp(MainWindow window) {
		this(window, new MetalLookAndFeel());
	}
	
	/**
	 * 
	 * @param window
	 * @param laf
	 */
	public SwingApp(MainWindow window, LookAndFeel laf) {
		this.window = window;
		this.laf = laf;
	}
	
	public void run() throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(this.laf);
		this.window.show();
	}
}
