package application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Read {

	protected Shell shlRead;

	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			Read window = new Read();
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
		shlRead.open();
		shlRead.layout();
		while (!shlRead.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRead = new Shell();
		shlRead.setSize(350, 300);
		shlRead.setText("Read");
		shlRead.setLayout(new GridLayout(6, false));
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		Button btnRadioButton = new Button(shlRead, SWT.RADIO);
		btnRadioButton.setText("Film");
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		
		Button btnRadioButton_1 = new Button(shlRead, SWT.RADIO);
		btnRadioButton_1.setText("Series");
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		
		Button BackButton = new Button(shlRead, SWT.NONE);
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shlRead.close();
				new Login().open();
			}
		});
		BackButton.setText("Back");
		new Label(shlRead, SWT.NONE);
		new Label(shlRead, SWT.NONE);
		Button SubmitButton = new Button(shlRead, SWT.NONE);
		SubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				boolean film=btnRadioButton.getSelection();
				boolean series=btnRadioButton_1.getSelection();
				if(film)
				{
					shlRead.close();
					new FilmRead().open();
				}
				else if(series)
					{
						shlRead.close();
						new SeriesRead().open();
					}
			}
		});
		SubmitButton.setText("Submit");

	}

}
