package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

import java.sql.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ShowIdTitle {

	protected Shell shlShowIdTitle;

	/**
	 * Launch the application.
	 * @param args
	 */
	static String id,title;
	public static void main(String[] args) {
		try {
			ShowIdTitle window = new ShowIdTitle();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ShowIdTitle()
	{
		
	}
	public ShowIdTitle(String i,String t)
	{
		id=i;
		title=t;
		open();
	}
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlShowIdTitle.open();
		while (!shlShowIdTitle.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlShowIdTitle = new Shell();
		shlShowIdTitle.setText("Film Details");
		shlShowIdTitle.setSize(635, 850);
		Label[] arr=new Label[17];
		int ndx=0;
		
		Label lblNewLabel = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel.setBounds(10, 11, 184, 18);
		lblNewLabel.setText("ID");
		
		Label lblNewLabel_2 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_2.setBounds(10, 50, 184, 18);
		lblNewLabel_2.setText("Title");
		
		Label lblNewLabel_3 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_3.setBounds(10, 89, 184, 18);
		lblNewLabel_3.setText("Year");
		
		Label lblNewLabel_4 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_4.setBounds(10, 128, 184, 18);
		lblNewLabel_4.setText("Genre");
		
		Label lblNewLabel_5 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_5.setBounds(10, 167, 184, 18);
		lblNewLabel_5.setText("Director");
		
		Label lblNewLabel_6 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_6.setBounds(10, 206, 184, 18);
		lblNewLabel_6.setText("Screenwriter");
		
		Label lblNewLabel_7 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_7.setBounds(10, 245, 184, 18);
		lblNewLabel_7.setText("Lead Actor");
		
		Label lblNewLabel_8 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_8.setBounds(10, 290, 184, 18);
		lblNewLabel_8.setText("Lead Actress");
		
		Label lblNewLabel_9 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_9.setBounds(10, 332, 184, 18);
		lblNewLabel_9.setText("Supporting Actor");
		
		Label lblNewLabel_10 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_10.setBounds(10, 374, 184, 18);
		lblNewLabel_10.setText("Supporting Actress");
		
		Label lblNewLabel_1 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_1.setBounds(10, 408, 184, 18);
		lblNewLabel_1.setText("Composer");
		
		Label lblNewLabel_11 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_11.setBounds(10, 452, 184, 18);
		lblNewLabel_11.setText("IMDB");
		
		Label lblNewLabel_12 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_12.setBounds(10, 500, 184, 18);
		lblNewLabel_12.setText("Rotten Tomatoes");
		
		Label lblNewLabel_13 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_13.setBounds(10, 552, 184, 18);
		lblNewLabel_13.setText("Budget");
		
		Label lblNewLabel_14 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_14.setBounds(10, 597, 184, 18);
		lblNewLabel_14.setText("Box Office");
		
		Label lblNewLabel_15 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_15.setBounds(10, 644, 184, 18);
		lblNewLabel_15.setText("Oscars");
		
		Label lblNewLabel_16 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_16.setBounds(10, 678, 184, 18);
		lblNewLabel_16.setText("Golden Globes");
		
		Label lblNewLabel_17 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_17.setBounds(268, 11, 648, 18);
		lblNewLabel_17.setText("New Label");
		
		
		Label lblNewLabel_18 = new Label(shlShowIdTitle, SWT.NONE);
		lblNewLabel_18.setBounds(268, 50, 648, 18);
		lblNewLabel_18.setText("New Label");
		
		Label label = new Label(shlShowIdTitle, SWT.NONE);
		label.setText("New Label");
		label.setBounds(268, 89, 648, 18);
		
		Label label_1 = new Label(shlShowIdTitle, SWT.NONE);
		label_1.setText("New Label");
		label_1.setBounds(268, 128, 648, 18);
		
		Label label_2 = new Label(shlShowIdTitle, SWT.NONE);
		label_2.setText("New Label");
		label_2.setBounds(268, 167, 648, 18);
		
		Label label_3 = new Label(shlShowIdTitle, SWT.NONE);
		label_3.setText("New Label");
		label_3.setBounds(268, 206, 648, 18);
		
		Label label_4 = new Label(shlShowIdTitle, SWT.NONE);
		label_4.setText("New Label");
		label_4.setBounds(268, 245, 648, 18);
		
		Label label_5 = new Label(shlShowIdTitle, SWT.NONE);
		label_5.setText("New Label");
		label_5.setBounds(268, 290, 648, 18);
		
		Label label_6 = new Label(shlShowIdTitle, SWT.NONE);
		label_6.setText("New Label");
		label_6.setBounds(268, 332, 648, 18);
		
		Label label_7 = new Label(shlShowIdTitle, SWT.NONE);
		label_7.setText("New Label");
		label_7.setBounds(268, 374, 648, 18);
		
		Label label_8 = new Label(shlShowIdTitle, SWT.NONE);
		label_8.setText("New Label");
		label_8.setBounds(268, 408, 648, 18);
		
		Label label_9 = new Label(shlShowIdTitle, SWT.NONE);
		label_9.setText("New Label");
		label_9.setBounds(268, 452, 648, 18);
		
		Label label_10 = new Label(shlShowIdTitle, SWT.NONE);
		label_10.setText("New Label");
		label_10.setBounds(268, 500, 648, 18);
		
		Label label_11 = new Label(shlShowIdTitle, SWT.NONE);
		label_11.setText("New Label");
		label_11.setBounds(268, 552, 648, 18);
		
		Label label_12 = new Label(shlShowIdTitle, SWT.NONE);
		label_12.setText("New Label");
		label_12.setBounds(268, 597, 648, 18);
		
		Label label_13 = new Label(shlShowIdTitle, SWT.NONE);
		label_13.setText("New Label");
		label_13.setBounds(268, 644, 648, 18);
		
		Label label_14 = new Label(shlShowIdTitle, SWT.NONE);
		label_14.setText("New Label");
		label_14.setBounds(268, 678, 648, 18);
		arr[ndx++]=lblNewLabel_17;
		arr[ndx++]=lblNewLabel_18;
		arr[ndx++]=label;
		arr[ndx++]=label_1;
		arr[ndx++]=label_2;
		arr[ndx++]=label_3;
		arr[ndx++]=label_4;
		arr[ndx++]=label_5;
		arr[ndx++]=label_6;
		arr[ndx++]=label_7;
		arr[ndx++]=label_8;
		arr[ndx++]=label_9;
		arr[ndx++]=label_10;
		arr[ndx++]=label_11;
		arr[ndx++]=label_12;
		arr[ndx++]=label_13;
		arr[ndx++]=label_14;
		
		Button btnNewButton = new Button(shlShowIdTitle, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shlShowIdTitle.close();
				new FilmRead().open();
			}
		});
		btnNewButton.setBounds(474, 698, 94, 32);
		btnNewButton.setText("Back");
		String qry="select f.id,title,year,genre,d.name director,s.name screenwriter,a.lead_actor,a.lead_actress,a.supp_actor,	a.supp_actress,c.name composer,imdb,rot_tom,budget,box_office,oscars,golden_globes from film f left join film_awards w on f.id=w.id, director d,screenwriter s,film_cast a,composer c where	f.dir_id=d.dir_id and f.sc_id=s.sc_id and f.cas_id=a.cas_id and	f.comp_id=c.comp_id";
		if(!id.equals(""))
			qry+=" and	f.id='"+id+"'";
		else
			qry+=" and	f.title='"+title+"'";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			ndx=0;
			if(rs.next())
			  	while(ndx<19)
			  	{
			  		String str=rs.getString(ndx+1);
			  		if(str!=null)
			  			arr[ndx++].setText(str);
			  		else
			  			arr[ndx++].setText("-NA-");
			  	}
				while(ndx<19)
			  		arr[ndx++].setText("-NA-");
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
