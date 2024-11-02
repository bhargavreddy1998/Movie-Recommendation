package application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ReadWrite {

	protected Shell shlReadWrite;

	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			ReadWrite window = new ReadWrite();
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
		shlReadWrite.open();
		shlReadWrite.layout();
		while (!shlReadWrite.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlReadWrite = new Shell();
		shlReadWrite.setSize(450, 300);
		shlReadWrite.setText("Choose Action");
		shlReadWrite.setLayout(new GridLayout(6, false));
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		Button btnRadioButton = new Button(shlReadWrite, SWT.RADIO);
		btnRadioButton.setText("Read");
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		
		Button btnRadioButton_1 = new Button(shlReadWrite, SWT.RADIO);
		btnRadioButton_1.setText("Write");
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		
		Button BackButton = new Button(shlReadWrite, SWT.NONE);
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shlReadWrite.close();
				new Login().open();
			}
		});
		BackButton.setText("Back");
		new Label(shlReadWrite, SWT.NONE);
		new Label(shlReadWrite, SWT.NONE);
		Button SubmitButton = new Button(shlReadWrite, SWT.NONE);
		SubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(btnRadioButton.getSelection())
				{
					shlReadWrite.close();
					new Read().open();
				}
				else if(btnRadioButton_1.getSelection())
				{
					shlReadWrite.close();
					new Write().open();
				}
			}
		});
		SubmitButton.setText("Submit");

	}

}
