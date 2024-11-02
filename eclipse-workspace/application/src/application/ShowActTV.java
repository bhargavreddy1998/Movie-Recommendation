package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

import java.sql.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ShowActTV {

	protected Shell shell;
	String gen="";
	boolean imdb,box;
	public ShowActTV()
	{
		
	}
	public ShowActTV(String s,boolean i,boolean b)
	{
		gen=s;
		imdb=i;
		box=b;
		open();
	}
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ShowActTV window = new ShowActTV();
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
		shell.setSize(1150, 630);
		shell.setText(gen);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 1124, 18);
		lblNewLabel.setText("ID		Title						Genre		Year		IMDB		Nielsen	");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 62, 1124, 18);
		lblNewLabel_1.setText("");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText("");
		label.setBounds(10, 100, 1124, 18);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("");
		label_1.setBounds(10, 137, 1124, 18);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("");
		label_2.setBounds(10, 176, 1124, 18);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("");
		label_3.setBounds(10, 212, 1124, 18);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("");
		label_4.setBounds(10, 243, 1124, 18);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("");
		label_5.setBounds(10, 282, 1124, 18);
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("");
		label_6.setBounds(10, 321, 1124, 18);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("");
		label_7.setBounds(10, 358, 1124, 18);
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setText("");
		label_8.setBounds(10, 396, 1124, 18);
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setText("");
		label_9.setBounds(10, 436, 1124, 18);
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setText("");
		label_10.setBounds(10, 478, 1124, 18);
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setText("");
		label_11.setBounds(10, 514, 1124, 18);
		Label[] arr=new Label[13];
		int ndx=0;
		arr[ndx++]=lblNewLabel_1;
		arr[ndx++]=label;
		arr[ndx++]=label_1;
		arr[ndx++] = label_2;
		arr[ndx++] = label_3;
		arr[ndx++] = label_4;
		arr[ndx++]=label_5;
		arr[ndx++]=label_6;
		arr[ndx++]=label_7;
		arr[ndx++]=label_8;
		arr[ndx++]=label_9;
		arr[ndx++]=label_10;
		arr[ndx++]=label_11;
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shell.close();
				new SeriesRead().open();
			}
		});
		btnNewButton.setBounds(513, 541, 118, 39);
		btnNewButton.setText("Back");
		gen="Michael Emerson";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			String qry="select id,title,genre,s_year,e_year,imdb,nielsen from series natural join tv_cast where lead_actor='"+gen+"' or lead_actress='"+gen+"' or supp_actor='"+gen+"' or supp_actress='"+gen+"' order by ";
			if(imdb)
				qry+="imdb";
			else
				qry+="nielsen";
			qry+=" desc";
			ResultSet rs = stmt.executeQuery(qry);
			ndx = 0;
//			boolean val=rs.next();
//			System.out.println(val);
			while(rs.next())
			{
				String str=rs.getString(1)+"		"+rs.getString(2)+space(rs.getString(2),48)+rs.getString(3)+space(rs.getString(3),14)+rs.getString(4)+"-"+rs.getString(5)+space(rs.getString(5),14)+rs.getString(6)+space(rs.getString(6),17)+rs.getString(7);	
				arr[ndx++].setText(str);
			}
			con.close();
		} catch (Exception e) {
			System.out.println("Errot"+e);
		}

	}

	

	public String space(String str2,int val)
	{
		String str="";
		int i=0;
		while(str2.length()+i++<val)
			str+=" ";
		
		return str;
	}
}
