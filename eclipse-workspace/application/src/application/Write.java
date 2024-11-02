package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Write {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Write window = new Write();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Write");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.setBounds(151, 141, 141, 18);
		btnRadioButton.setText("TV Series");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.setBounds(151, 108, 141, 18);
		btnRadioButton_1.setText("Film");
		
		
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shell.close();
				new Login().open();
			}
		});
		btnNewButton.setBounds(10, 222, 118, 39);
		btnNewButton.setText("Back");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				boolean film=btnRadioButton_1.getSelection();
				boolean series=btnRadioButton.getSelection();			
				if(film)
					{
						shell.close();
						new FilmWrite().open();
					}
				else if(series)
					{
						shell.close();
						new SeriesWrite().open();
						}
			}
		});
		btnNewButton_1.setBounds(316, 222, 118, 39);
		btnNewButton_1.setText("Submit");
		
	}
}
