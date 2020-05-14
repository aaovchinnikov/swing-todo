package ru.hse.todo.swing.controls;

import java.awt.Dimension;

import javax.swing.JFrame;

public final class MainWindow {
	private final JFrame jFrame;

	public MainWindow() {
		this.jFrame = new JFrame();
		this.jFrame.setTitle("TODO App");
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setMinimumSize(new Dimension(320, 270));
		this.jFrame.pack();
		this.jFrame.setLocationRelativeTo(null);
	}
	
	public void show() {
		rebuildUI(new MainPane(false, this));
		this.jFrame.setVisible(true);
	}
	
	public void rebuildUI(ContentPane pane) {
		pane.bind(this.jFrame);
		this.jFrame.validate();
	}
}
