package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FilmRead {

	protected Shell shlQueryParameters;
	private Text IDText;
	private Text TitleText;
	private Text GenreText;
	private Text DirectorText;
	private Text ScreenwriterText;
	private Text ActorText;
	String id,title,genre,dir,scr,actor;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FilmRead window = new FilmRead();
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
		shlQueryParameters.open();
		shlQueryParameters.layout();
		while (!shlQueryParameters.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlQueryParameters = new Shell();
		shlQueryParameters.setSize(562, 597);
		shlQueryParameters.setText("Query Parameters");
		shlQueryParameters.setLayout(new GridLayout(4, false));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label IdLabel = new Label(shlQueryParameters, SWT.NONE);
		IdLabel.setText("ID");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		IDText = new Text(shlQueryParameters, SWT.BORDER);
		IDText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label TitleLabel = new Label(shlQueryParameters, SWT.NONE);
		TitleLabel.setText("Title");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		TitleText = new Text(shlQueryParameters, SWT.BORDER);
		TitleText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label GenreLabel = new Label(shlQueryParameters, SWT.NONE);
		GenreLabel.setText("Genre");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		GenreText = new Text(shlQueryParameters, SWT.BORDER);
		GenreText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label DirectorLabel = new Label(shlQueryParameters, SWT.NONE);
		DirectorLabel.setText("Director");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		DirectorText = new Text(shlQueryParameters, SWT.BORDER);
		DirectorText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label ScreenwriterLabel = new Label(shlQueryParameters, SWT.NONE);
		ScreenwriterLabel.setText("Screenwriter");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		ScreenwriterText = new Text(shlQueryParameters, SWT.BORDER);
		ScreenwriterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label ActorLabel = new Label(shlQueryParameters, SWT.NONE);
		ActorLabel.setText("Actor");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		ActorText = new Text(shlQueryParameters, SWT.BORDER);
		GridData gd_ActorText = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_ActorText.heightHint = 30;
		ActorText.setLayoutData(gd_ActorText);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(shlQueryParameters, SWT.NONE);
		lblNewLabel_6.setText("Sort By:");
		new Label(shlQueryParameters, SWT.NONE);
		
		Button btnRadioButton = new Button(shlQueryParameters, SWT.RADIO);
		btnRadioButton.setText("IMDB Rating");
		
		Button btnRadioButton_1 = new Button(shlQueryParameters, SWT.RADIO);
		btnRadioButton_1.setText("Box Office Collection");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		
		
		
		
		Button btnNewButton = new Button(shlQueryParameters, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shlQueryParameters.close();
				new Read().open();
			}
		});
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setText("Back");
		new Label(shlQueryParameters, SWT.NONE);
		new Label(shlQueryParameters, SWT.NONE);
		Button submitButton = new Button(shlQueryParameters, SWT.NONE);
		submitButton.setText("Submit");
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				id=IDText.getText();
				title=Case(TitleText.getText());
				genre=Case(GenreText.getText());
				dir=Case(DirectorText.getText());
				scr=Case(ScreenwriterText.getText());
				actor=Case(ActorText.getText());
				boolean imdb=btnRadioButton.getSelection();
				boolean box=btnRadioButton_1.getSelection();
				shlQueryParameters.close();
				System.out.print(id);
				System.out.print(title);
				if (isNotNull(id)||isNotNull(title))
					new ShowIdTitle(id,title);
				else if (isNotNull(genre))
					new ShowGen(genre,imdb,box);
				else if(isNotNull(dir))
					new ShowDir(dir,imdb,box);
				else if(isNotNull(scr))
					new ShowScr(scr,imdb,box);
				else if(isNotNull(actor))
					new ShowAct(actor,imdb,box);
					
			}
		});

	}
	String Case(String str)
	{
		if(str.length()==0)return str;
		str=str.trim();
		String txt=""+Character.toUpperCase(str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' '&&i<str.length()-1 )
				txt+=ch+""+Character.toUpperCase(str.charAt(++i));
			else
				txt+=ch;
		}
		return txt;
	}
	boolean isNotNull(String str)
	{
		return !str.equals("");
	}

}
