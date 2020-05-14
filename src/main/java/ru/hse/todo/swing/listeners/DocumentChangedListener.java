package ru.hse.todo.swing.listeners;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import ru.hse.todo.swing.controls.MainWindow;

public class DocumentChangedListener implements DocumentListener {
	private final MainWindow window;
	
    /**
	 * @param window
	 */
	public DocumentChangedListener(MainWindow window) {
		this.window = window;
	}

	@Override
    public void insertUpdate(DocumentEvent e) {
    	System.out.println(field.getText());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
    	System.out.println(field.getText());
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    	System.out.println(field.getText());
    }

}
