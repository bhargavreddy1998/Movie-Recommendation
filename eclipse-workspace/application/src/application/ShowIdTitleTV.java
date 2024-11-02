package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

import java.sql.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ShowIdTitleTV {

	protected Shell shlShowIdTitleTV;

	/**
	 * Launch the application.
	 * @param args
	 */
	static String id,title;
	public static void main(String[] args) {
		try {
			ShowIdTitleTV window = new ShowIdTitleTV();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ShowIdTitleTV()
	{
		
	}
	public ShowIdTitleTV(String i,String t)
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
		shlShowIdTitleTV.open();
		while (!shlShowIdTitleTV.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlShowIdTitleTV = new Shell();
		shlShowIdTitleTV.setText("Series Details");
		shlShowIdTitleTV.setSize(635, 850);
		Label[] arr=new Label[25];
		int ndx=0;
		
		Label lblNewLabel = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel.setBounds(10, 11, 184, 18);
		lblNewLabel.setText("ID");
		
		Label lblNewLabel_2 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_2.setBounds(10, 50, 184, 18);
		lblNewLabel_2.setText("Title");
		
		Label lblNewLabel_3 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_3.setBounds(10, 89, 184, 18);
		lblNewLabel_3.setText("Start Year");
		
		Label lblNewLabel_4 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_4.setBounds(10, 128, 184, 18);
		lblNewLabel_4.setText("End Year");
		
		Label lblNewLabel_5 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_5.setBounds(10, 167, 184, 18);
		lblNewLabel_5.setText("Seasons");
		
		Label lblNewLabel_6 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_6.setBounds(10, 206, 184, 18);
		lblNewLabel_6.setText("Genre");
		
		Label lblNewLabel_7 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_7.setBounds(10, 245, 184, 18);
		lblNewLabel_7.setText("Creator");
		
		Label lblNewLabel_8 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_8.setBounds(10, 290, 184, 18);
		lblNewLabel_8.setText("Writer");
		
		Label lblNewLabel_9 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_9.setBounds(10, 332, 184, 18);
		lblNewLabel_9.setText("Lead Actor");
		
		Label lblNewLabel_10 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_10.setBounds(10, 374, 184, 18);
		lblNewLabel_10.setText("Lead Actress");
		
		Label lblNewLabel_1 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_1.setBounds(10, 408, 184, 18);
		lblNewLabel_1.setText("Supporting Actor");
		
		Label lblNewLabel_11 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_11.setBounds(10, 452, 184, 18);
		lblNewLabel_11.setText("Supporting Actress");
		
		Label lblNewLabel_12 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_12.setBounds(10, 486, 184, 18);
		lblNewLabel_12.setText("Network");
		
		Label lblNewLabel_13 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_13.setBounds(10, 514, 184, 18);
		lblNewLabel_13.setText("IMDB");
		
		Label lblNewLabel_14 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_14.setBounds(10, 549, 184, 18);
		lblNewLabel_14.setText("Rotten Tomatoes");
		
		Label lblNewLabel_15 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_15.setBounds(10, 584, 184, 18);
		lblNewLabel_15.setText("Budget");
		
		Label lblNewLabel_16 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_16.setBounds(10, 618, 184, 18);
		lblNewLabel_16.setText("Nielsen");
		
		Label lblNewLabel_17 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_17.setBounds(268, 11, 648, 18);
		lblNewLabel_17.setText("New Label");
		
		
		Label lblNewLabel_18 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_18.setBounds(268, 50, 648, 18);
		lblNewLabel_18.setText("New Label");
		
		Label label = new Label(shlShowIdTitleTV, SWT.NONE);
		label.setText("New Label");
		label.setBounds(268, 89, 648, 18);
		
		Label label_1 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_1.setText("New Label");
		label_1.setBounds(268, 128, 648, 18);
		
		Label label_2 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_2.setText("New Label");
		label_2.setBounds(268, 167, 648, 18);
		
		Label label_3 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_3.setText("New Label");
		label_3.setBounds(268, 206, 648, 18);
		
		Label label_4 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_4.setText("New Label");
		label_4.setBounds(268, 245, 648, 18);
		
		Label label_5 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_5.setText("New Label");
		label_5.setBounds(268, 290, 648, 18);
		
		Label label_6 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_6.setText("New Label");
		label_6.setBounds(268, 332, 648, 18);
		
		Label label_7 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_7.setText("New Label");
		label_7.setBounds(268, 374, 648, 18);
		
		Label label_8 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_8.setText("New Label");
		label_8.setBounds(268, 408, 648, 18);
		
		Label label_9 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_9.setText("New Label");
		label_9.setBounds(268, 452, 648, 18);
		
		Label label_10 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_10.setText("New Label");
		label_10.setBounds(268, 486, 648, 18);
		
		Label label_11 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_11.setText("New Label");
		label_11.setBounds(268, 514, 648, 18);
		
		Label label_12 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_12.setText("New Label");
		label_12.setBounds(268, 549, 648, 18);
		
		Label label_13 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_13.setText("New Label");
		label_13.setBounds(268, 584, 648, 18);
		
		Label label_14 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_14.setText("New Label");
		label_14.setBounds(268, 618, 648, 18);
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
		
		Button btnNewButton = new Button(shlShowIdTitleTV, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shlShowIdTitleTV.close();
				new SeriesRead().open();
			}
		});
		btnNewButton.setBounds(474, 698, 94, 32);
		btnNewButton.setText("Back");
		
		Label lblNewLabel_19 = new Label(shlShowIdTitleTV, SWT.NONE);
		lblNewLabel_19.setBounds(10, 654, 184, 18);
		lblNewLabel_19.setText("Emmys");
		
		Label lblGoldenGlobes = new Label(shlShowIdTitleTV, SWT.NONE);
		lblGoldenGlobes.setText("Golden Globes");
		lblGoldenGlobes.setBounds(10, 678, 184, 18);
		
		Label label_16 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_16.setText("New Label");
		label_16.setBounds(268, 654, 648, 18);
		
		Label label_17 = new Label(shlShowIdTitleTV, SWT.NONE);
		label_17.setText("New Label");
		label_17.setBounds(268, 678, 648, 18);

		arr[ndx++]=label_16;
		arr[ndx++]=label_17;
		String qry="select f.id,title,s_year,e_year,seasons,genre, d.name director,s.name screenwriter, a.lead_actor,a.lead_actress,a.supp_actor, a.supp_actress,c.name composer, imdb,rot_tom, f.budget,nielsen, emmys,golden_globes from series f left join tv_awards w on f.id=w.id,creator d,writer s,tv_cast a,network c where f.cr_id=d.cr_id and f.wr_id=s.wr_id and f.cas_id=a.cas_id and f.net_id=c.net_id";
		if(!id.equals(""))
			qry+=" and	f.id='"+id+"'";
		else
			qry+=" and	title='"+title+"'";
		System.out.println(qry);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			ndx=0;
			if(rs.next())
			  	while(ndx<20)
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
