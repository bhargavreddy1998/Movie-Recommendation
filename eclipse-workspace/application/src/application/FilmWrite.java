package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import java.sql.*;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
public class FilmWrite {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	String title,year,genre,dir,dir_id,scr,scr_id,cas_id,comp_id,la,las,sa,sas,comp,imdb,rot,budg,box;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FilmWrite window = new FilmWrite();
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
		shell.setSize(750, 800);
		shell.setText("Insert Film");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(0, 25, 151, 18);
		lblNewLabel.setText("Title");
		
		Label lblYear = new Label(shell, SWT.NONE);
		lblYear.setText("Year");
		lblYear.setBounds(0, 68, 151, 18);
		
		Label lblGenre = new Label(shell, SWT.NONE);
		lblGenre.setText("Genre");
		lblGenre.setBounds(0, 111, 151, 18);
		
		Label lblDirector = new Label(shell, SWT.NONE);
		lblDirector.setText("Director");
		lblDirector.setBounds(0, 154, 151, 18);
		
		Label lblScreenwriter = new Label(shell, SWT.NONE);
		lblScreenwriter.setText("Screenwriter");
		lblScreenwriter.setBounds(0, 197, 151, 18);
		
		Label lblLeadActor = new Label(shell, SWT.NONE);
		lblLeadActor.setText("Lead Actor");
		lblLeadActor.setBounds(0, 240, 151, 18);
		
		Label lblLeadActress = new Label(shell, SWT.NONE);
		lblLeadActress.setText("Lead Actress");
		lblLeadActress.setBounds(0, 283, 151, 18);
		
		Label lblSuppActor = new Label(shell, SWT.NONE);
		lblSuppActor.setText("Supp. Actor");
		lblSuppActor.setBounds(0, 326, 151, 18);
		
		Label lblSuppActress = new Label(shell, SWT.NONE);
		lblSuppActress.setText("Supp. Actress");
		lblSuppActress.setBounds(0, 369, 151, 18);
		
		Label lblComposer = new Label(shell, SWT.NONE);
		lblComposer.setText("Composer");
		lblComposer.setBounds(0, 412, 151, 18);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(0, 455, 151, 18);
		lblNewLabel_1.setText("IMDB");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(0, 498, 151, 18);
		lblNewLabel_2.setText("Rotten Tomatoes");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(0, 541, 151, 18);
		lblNewLabel_3.setText("Budget");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(0, 584, 151, 18);
		lblNewLabel_4.setText("Box Office");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				shell.close();
				new Write().open();
			}
		});
		btnNewButton.setBounds(0, 680, 118, 39);
		btnNewButton.setText("Back");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(598, 680, 118, 39);
		btnNewButton_1.setText("Submit");
		Text[] arr=new Text[14];
		int ndx=0;
		text = new Text(shell, SWT.BORDER);
		text.setBounds(219, 25, 497, 30);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(219, 68, 497, 30);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(219, 111, 497, 30);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(219, 154, 497, 30);
		
		System.out.println(dir);
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(219, 197, 497, 30);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(219, 240, 497, 30);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(219, 283, 497, 30);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setBounds(219, 326, 497, 30);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setBounds(219, 369, 497, 30);
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setBounds(219, 417, 497, 30);
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setBounds(219, 455, 497, 30);
		
		text_11 = new Text(shell, SWT.BORDER);
		text_11.setBounds(219, 498, 497, 30);
		
		text_12 = new Text(shell, SWT.BORDER);
		text_12.setBounds(219, 541, 497, 30);
		
		text_13 = new Text(shell, SWT.BORDER);
		text_13.setBounds(219, 584, 497, 30);
		
		arr[ndx++]=text;
		arr[ndx++] = text_1;
		arr[ndx++] = text_2;
		arr[ndx++] = text_3;
		arr[ndx++] = text_4;
		arr[ndx++] = text_5;
		arr[ndx++] = text_6;
		arr[ndx++] = text_7;
		arr[ndx++] = text_8;
		arr[ndx++] = text_9;
		arr[ndx++] = text_10;
		arr[ndx++] = text_11;
		arr[ndx++] = text_12;
		arr[ndx++] = text_13;
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				title = Case(text.getText());
				year = Case(text_1.getText());
				genre = Case(text_2.getText());
				dir = Case(text_3.getText());
				scr = Case(text_4.getText());
				la = Case(text_5.getText());
				las = Case(text_6.getText());
				sa = Case(text_7.getText());
				sas = Case(text_8.getText());
				comp = Case(text_9.getText());
				imdb = Case(text_10.getText());
				rot = Case(text_11.getText());
				budg = Case(text_12.getText());
				box = Case(text_13.getText());
				for(int i=0;i<14;i++)
					arr[i].setText("");
				insertDir();
				insertScr();
				insertCast();
				insertComp();
				insertFilm();
			}
		});
	}	
	
	public void insertFilm() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select count(id) from film");
			String fid="";
			if (rs.next())
				fid= (rs.getString(1));
			int val = Integer.parseInt(fid) + 1;
			fid = "F" + val;
			System.out.println(fid+" "+dir_id+" "+scr_id+" "+comp_id+" "+cas_id);
			rs = stmt.executeQuery("insert into film values ('" + fid + "','" + title + "'," + year + ",'" + genre
					+ "','" + dir_id + "','"+ scr_id + "','" + cas_id + "','"+ comp_id + "',"+imdb+","+rot+","+budg+","+box+")");
			if(rs.next())
			con.close();
		} catch (Exception e) {
			System.out.println("1"+e);
		}
	}
	public void insertComp() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select comp_id from composer where name='" + comp + "'");
			if (rs.next()) {
				comp_id = rs.getString(1);
				return;
			}
			rs = stmt.executeQuery("select count(comp_id) from composer");
			if(rs.next())
			comp_id = (rs.getString(1));
			int val = Integer.parseInt(comp_id) + 1;
			comp_id = "M" + val;
			rs = stmt.executeQuery("insert into composer values ('" + comp_id + "','" + comp + "')");
			if(rs.next())
			con.close();
		} catch (Exception e) {
			System.out.println(2);
		}
	}
	public void insertCast() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select count(cas_id) from film_cast");
			if(rs.next())
				cas_id = (rs.getString(1));
			int val = Integer.parseInt(cas_id) + 1;
			cas_id = "C" + val;
			rs = stmt.executeQuery("insert into film_cast values ('" + cas_id + "','" + la + "','" + las + "','" + sa + "','"+ sas + "')");
			if(rs.next())
			con.close();
		} catch (Exception e) {
			System.out.println(3);
		}
	}
	public void insertScr() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select sc_id from screenwriter where name='" + scr + "'");
			if (rs.next()) {
				scr_id = rs.getString(1);
				return;
			}
			rs = stmt.executeQuery("select count(sc_id) from screenwriter");
			if(rs.next())
			scr_id = (rs.getString(1));
			int val = Integer.parseInt(scr_id) + 1;
			scr_id = "S" + val;
			rs = stmt.executeQuery("insert into screenwriter values ('" + scr_id + "','" + scr + "',234.4,8.7)");
			if(rs.next())
			con.close();
		} catch (Exception e) {
			System.out.println(4);
		}
	}
	public void insertDir()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select dir_id from director where name='"+dir+"'");
			System.out.println(dir);
			if(rs.next())
			{
				dir_id=rs.getString(1);
				return;
			}
			rs=stmt.executeQuery("select count(dir_id) from director");
			if(rs.next())
			dir_id=(rs.getString(1));
			int val=Integer.parseInt(dir_id)+1;
			dir_id="D"+val;
			rs=stmt.executeQuery("insert into director values ('"+dir_id+"','"+dir+"',234.4,8.7)");
			if(rs.next())
			con.close();
		} catch (Exception e) {
			System.out.println("5"+e);
		}
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
}
