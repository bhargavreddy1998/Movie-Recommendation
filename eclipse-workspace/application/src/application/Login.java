package application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Login  {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
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
		shell.setText("Enter Credentials");
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(141, 10, 176, 18);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 63, 81, 18);
		lblNewLabel_1.setText("User Name");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 129, 81, 18);
		lblNewLabel_2.setText("Password");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(160, 51, 274, 30);
		
		text_1 = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(160, 117, 274, 30);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				String usr=text.getText();
				String pwd=text_1.getText();
				if(isAdmin(usr,pwd))
				{
					shell.close();
					new ReadWrite().open();
				}
				else if(isAuxAdmin(usr,pwd))
				{
					shell.close();
					new Write().open();
				}
				else if(usr.equalsIgnoreCase("user") && pwd.equals("user"))
				{
					shell.close();
					new Read().open();
				}
				else 
					lblNewLabel.setText("Invalid Credentials");
				
			}
		});
		btnNewButton.setBounds(167, 200, 118, 39);
		btnNewButton.setText("Submit");
				

	}
	boolean isAuxAdmin(String user,String pwd)
	{
		return (user.equalsIgnoreCase("aux_admin") && pwd.equals("tyrion"));
	}
	boolean isAdmin(String user,String pwd)
	{
		return (user.equalsIgnoreCase("admin")&& pwd.equals("harold"));
	}
}
