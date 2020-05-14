package ru.hse.todo.swing;

import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import ru.hse.todo.swing.controls.MainWindow;

public class Main {
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		new SwingApp(
			new MainWindow(),
			new NimbusLookAndFeel()
//			new MetalLookAndFeel()
		).run();
	}
}
