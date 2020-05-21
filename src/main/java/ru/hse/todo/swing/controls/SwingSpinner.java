package ru.hse.todo.swing.controls;

import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public final class SwingSpinner implements SwingControl{
	private final JSpinner spinner;
	
	/**
	 * @param spinner
	 */
	private SwingSpinner(JSpinner spinner) {
		this.spinner = spinner;
		final JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(this.spinner);
		this.spinner.setEditor(timeEditor);
		this.spinner.setValue(new Date()); // will only show the current time
	}

	public SwingSpinner() {
		this.spinner = new JSpinner(
			new SpinnerDateModel()
		);
//		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(this.spinner, "HH:mm:ss");
		final JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(this.spinner);
		this.spinner.setEditor(timeEditor);
		this.spinner.setValue(new Date()); // will only show the current time
	}


	@Override
	public SwingSpinner withParent(JPanel parent, Object constraints) {
		final JSpinner spinner = new JSpinner(
				new SpinnerDateModel()
		);
		parent.add(spinner, constraints);
		return new SwingSpinner(spinner);
	}

}
