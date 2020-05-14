package ru.hse.todo.swing.controls;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public final class MainWindow {
	private final JFrame jFrame;
	private final JTextField field;
	private final JButton button;

	public MainWindow() {
		this.jFrame = new JFrame();
		this.field = new JTextField();
		this.button = new JButton();
	}
	
	public void show() {
		button.setEnabled(false);
		this.field.getDocument().addDocumentListener(new DocumentListener() {
		    @Override
		    public void insertUpdate(DocumentEvent e) {
		     	try {
		     		final Document document = e.getDocument();
					System.out.println(document.getText(0, document.getLength()));
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
		    }

		    @Override
		    public void removeUpdate(DocumentEvent e) {
		     	try {
		     		final Document document = e.getDocument();
					System.out.println(document.getText(0, document.getLength()));
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
		    }

		    @Override
		    public void changedUpdate(DocumentEvent e) {
		     	try {
		     		final Document document = e.getDocument();
					System.out.println(document.getText(0, document.getLength()));
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
		    }
		});
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		final GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0};
		this.jFrame.getContentPane().setLayout(gridBagLayout);
		// FIXME Temporal coupling
		this.jFrame.getContentPane().add(this.field, gbc_panel_1);
		this.jFrame.setTitle("TODO App");
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setMinimumSize(new Dimension(320, 270));
		this.jFrame.pack();
		this.jFrame.setLocationRelativeTo(null);
		
		this.jFrame.setVisible(true);
	}
}
