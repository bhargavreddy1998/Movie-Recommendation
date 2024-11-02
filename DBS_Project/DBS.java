package DBS_Project;
import java.sql.*;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
public class DBS {

	private JLabel lblDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new DBS();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DBS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame("DB Connection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblDetails=new JLabel("Instructors:");   
        lblDetails.setBounds(50,100, 250,20);      
        JButton btnGetDetails=new JButton("Get Details");  
        btnGetDetails.setBounds(50,150,95,30);   
        frame.add(btnGetDetails);
        frame.add(lblDetails);    
        frame.setSize(400,400);  
        frame.setLayout(null);  

        frame.setVisible(true);  
       	frame.setSize(300,300);
      	
        btnGetDetails.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        try {
			
					        // step1 load the driver class			
					        Class.forName("oracle.jdbc.driver.OracleDriver");			
					        // step2 create the connection object			
					        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "harold", "dashwood");			
					        // step3 create the statement object			
					        Statement stmt = con.createStatement();			
					        // step4 execute query					        
					        ResultSet rs = stmt.executeQuery("SELECT * FROM instructor where dept_name='Comp. Sci.'");
					        System.out.println("connected");
					        while (rs.next())
					        {		
					        	lblDetails.setText(lblDetails.getText() + " " + rs.getInt(1) + "  " + rs.getString(2));
					        }
					        // step5 close the connection object			
					        con.close();			
					    } catch (SQLException ex) {
			
					        System.out.println(ex);
			
					    }catch (ClassNotFoundException ex) {
			
					        System.out.println(ex);			
					    }
			    }
			});	
		 
	}

}
