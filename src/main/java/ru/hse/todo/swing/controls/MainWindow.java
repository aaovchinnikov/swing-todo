package ru.hse.todo.swing.controls;

import java.awt.Dimension;

import javax.swing.JFrame;

public final class MainWindow {
	private final JFrame jFrame;

	public MainWindow() {
		this.jFrame = new JFrame();
	}
	
	public void show() {
		this.jFrame.setTitle("TODO App");
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setMinimumSize(new Dimension(320, 270));
		this.jFrame.pack();
		this.jFrame.setLocationRelativeTo(null);
		this.jFrame.setVisible(true);
	}
}
