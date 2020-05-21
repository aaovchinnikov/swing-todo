package ru.hse.todo.swing.controls;

import java.awt.LayoutManager;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public final class SwingPanel implements ContentPane {
	private final JPanel panel;
	
	public SwingPanel(LayoutManager layout, Map<SwingControl, Object> children) {
		this(null, layout, children);
	}
	
	public SwingPanel(Border border, LayoutManager layout, Map<SwingControl, Object> children) {
		this.panel = new JPanel();
		this.panel.setLayout(layout);
		this.panel.setBorder(border);
		for(Entry<SwingControl, Object> entry : children.entrySet()) {
			entry.getKey().withParent(this.panel, entry.getValue());
		}
	}
	
	@Override
	public void bind(JFrame parent) {
		parent.setContentPane(this.panel);
	}

}
