package ru.hse.todo.swing.controls;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public final class ListPane implements ContentPane {
	private final JList jList;
	private final JPanel panel;
	
	public ListPane() {
		this.jList = new JList<>();
		this.panel = new JPanel();
	}
	
	// TODO need to name it more semantically correct
	public void show() {
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		this.panel.setLayout(gbl_panel);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		this.panel.add(list, gbc_list);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		this.panel.add(panel_2, gbc_panel_2);
		
		JButton btnNewButton = new JButton("Add");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setEnabled(false);
	}
	
	@Override
	public void bind(JFrame parent) {
		parent.setContentPane(this.panel);
	}
}


