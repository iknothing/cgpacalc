package cgpacalculator;
import java.util.*;
import java.sql.*;
public class cgpacal2 {
//	o 3 o 3 o 3 o 3 o 3 o 3 o 3 o 3 

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			HashMap<String,Integer> grade= new HashMap<>();
			int[] gpnt =new int[10];
			int[] credits = new int[10];
			int[] gpa =  new int[10];
			grade.put("o",10);
			grade.put("a+",9);
			grade.put("a",8);
			grade.put("b+",7);
			grade.put("b",6);
			grade.put("c",5);
			grade.put("p",4);
			grade.put("f",0);
			grade.put("ab",0);
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpadb","manas","password");
				Statement stmt=con.createStatement();
				String[] subjects = {"DatabaseManagementSystem","TheoryofComputation","Systemprogramming&OperatingSystem","ComputerNetworks&security","elective1","Data science and big data","web technology","artificial intelligence"};
				System.out.println("Dear third year student");
				String query= "create table if not exists department(subname varchar(40),grade int,credits int);";
				stmt.executeUpdate(query);
//				System.out.println(subjects.length);
					for(int i=0;i<8;i++) {
						System.out.println("enter ur grade in "+subjects[i]+" subject:");
						String s1=sc.next();
						int f;
						f=grade.get(s1);
						gpnt[i]=f;
						
						System.out.println("enter ur obtained credits in "+subjects[i]+" subject");
						int x= sc.nextInt();
						credits[i]=x;
						String query1= "insert into department(subname,grade,credits) values('"+subjects[i]+"',"+gpnt[i]+","+credits[i]+");";
						stmt.executeUpdate(query1);
					}
					int totalgpa=0;
					int totalcredits=0;
					for(int i=0;i<8;i++) {
						gpa[i]=gpnt[i]*credits[i];
						totalgpa+=gpa[i];
						totalcredits+=credits[i];
						
						
					}
					float cgpa =totalgpa/totalcredits;
					String query2= "insert into department values();";
					System.out.println("Your cgpa is"+cgpa);
					sc.close();
			
			
			con.close();
			}
			catch(Exception e) {
				System.out.print(e);
			}
			
			}		
}