package ru.hse.todo.swing.controls;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.AbstractMap;
import java.util.Map;

import javax.swing.JFrame;

public final class MainWindow {
	private final JFrame jFrame;

	public MainWindow() {
		this.jFrame = new JFrame();
		this.jFrame.setTitle("TODO App");
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setMinimumSize(new Dimension(320, 270));
		this.jFrame.setLocationRelativeTo(null);
	}
	
	public void show() {
		final Insets i0_0_5_5 = new Insets(0, 0, 5, 5);
		final Insets i0_0_5_0 = new Insets(0, 0, 5, 0);
		rebuildUI(
			new SwingPanel(
				new GridBagLayout(),
				Map.ofEntries(
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingLabel("Name"),
						new GridBagConstraints(
							0, 0,
							1, 1,
							0, 0,
							GridBagConstraints.EAST, GridBagConstraints.CENTER,
							i0_0_5_5,
							1, 1
						)
					),
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingTextField(),
						new GridBagConstraints(
							1, 0,
							1, 1,
							1, 0,
							GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL,
							i0_0_5_0,
							1, 1
						)
					),
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingLabel("Description"),
						new GridBagConstraints(
							0, 1,
							1, 1,
							0, 0,
							GridBagConstraints.EAST, GridBagConstraints.CENTER,
							i0_0_5_5,
							1, 1
						)
					),
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingTextField(),
						new GridBagConstraints(
							1, 1,
							1, 1,
							1, 0,
							GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL,
							i0_0_5_0,
							1, 1
						)
					),
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingLabel("Due"),
						new GridBagConstraints(
							0, 2,
							1, 1,
							0, 0,
							GridBagConstraints.EAST, GridBagConstraints.CENTER,
							i0_0_5_5,
							1, 1
						)
					),
					new AbstractMap.SimpleEntry<SwingControl, Object>(
						new SwingSpinner(),
						new GridBagConstraints(
							1, 2,
							1, 1,
							1, 0,
							GridBagConstraints.EAST, GridBagConstraints.HORIZONTAL,
							i0_0_5_0,
							1, 1
						)
					)					
				)
			)
		);
		this.jFrame.pack();
		this.jFrame.setVisible(true);
	}
	
	public void rebuildUI(ContentPane pane) {
		pane.bind(this.jFrame);
		this.jFrame.validate();
	}
}
