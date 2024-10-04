import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCHandling {

	
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet result;
	
	

	JDBCHandling(){



		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Arey bhai Driver mil gaya!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}





		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "9673");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}
	int insertStudentData( String username, String firstname,String lastname,long mobile,String address,String gender,String dob,String Email,String password,String degree) {
		int status=0;




		try {
			pstmt=con.prepareStatement("insert into studenttable values(default,?,?,?,?,?,?,?,?,?,?)");


            pstmt.setString(1,username);
			pstmt.setString(2,firstname);
			pstmt.setString(3,lastname);
			pstmt.setLong(4,mobile);
			pstmt.setString(5, address);
			pstmt.setString(6,gender);
			
			pstmt.setString(7,dob);
			pstmt.setString(8,Email);
			pstmt.setString(9,password);
			pstmt.setString(10,degree);



			status=pstmt.executeUpdate();



		} 


		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;




	}
	int insertAdminData( String username, String firstname,String lastname,long mobile,String address,String gender,String dob,String Email,String password) {
		int status=0;




		try {
			pstmt=con.prepareStatement("insert into admintable values(default,?,?,?,?,?,?,?,?,?)");


            pstmt.setString(1,username);
			pstmt.setString(2,firstname);
			pstmt.setString(3,lastname);
			pstmt.setLong(4,mobile);
			pstmt.setString(5, address);
			pstmt.setString(6,gender);
			pstmt.setString(7,dob);
			pstmt.setString(8,Email);
			pstmt.setString(9,password);
		



			status=pstmt.executeUpdate();



		} 


		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		return status;

		

	}
	
	

  
	
	
	
	
	ResultSet getRow(String userid) {
			
			
				
				
				
			
			
			
		 try {
			 
			 stmt=con.createStatement();
			 String query=("select password from studenttable where username=?");
			
			pstmt=con.prepareStatement(query);
			 pstmt.setString(1, userid);
			System.out.println(userid);
			result=stmt.executeQuery(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			System.out.println(result);
		return result;
	}
    	
	
	public Student ShowStudentProfile(String username) {

		String query ="select * from student where username=?";
		Student s1 = new Student();
		try {
			pstmt = con.prepareStatement(query);


            pstmt.setString(1,username);
			

			result = pstmt.executeQuery();

			while(result.next()) {

				s1.setId(result.getInt(1));
				s1.setFirstname(result.getString(2));
				s1.setLastname(result.getString(3));
				s1.setEmail(result.getString(4));
				s1.setCity(result.getString(5));



			
			}
			result.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s1;
	
	
 
	
}
	



