import java.io.*;
import java.math.BigDecimal;
class creator
{
	public static void main(String[] args) 
	{
		// String str[] = new String[13];
		// Scanner in=new Scanner(System.in);
		// for(int i=0;i<12;i++)
		// 	str[i]=in.nextLine();
		try
		{
			int count=0;
			
			PrintWriter fw = new PrintWriter("/home/finch/DBS Project/output.txt");
			FileReader fr = new FileReader("/home/finch/DBS Project/Genre.txt");
			BufferedReader st = new BufferedReader(fr);

			int k=2;
			count=0;
			String s="";
			for(int j=1;j<=50;j++)  
			{	
			//s=st.readLine();
			//s=Character.toUpperCase(s.charAt(0))+s.substring(1,s.length());
			//System.out.println();
			double d=(Math.random()*120)+40;
			s=String.format("%.0f",d);
			//s="CT";	
			//	if(j<10)s=s+"0";
			fw.println(s);
			}
			fw.close();
		}
		catch(Exception e)
		{}
	}
	
}