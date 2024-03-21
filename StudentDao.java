package studdentApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	
	public static boolean insertStudentData(StudentData st) {
		
		
		boolean b = false;
		
		try {
			
			Connection con = ConnectionProvider.connectionCreate();
	
			String query = "insert into students (sname, mobileNo, city) values (?, ?, ?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setString(1, st.getsName());
			
			pstm.setString(2, st.getsMobile());
			
			pstm.setString(3, st.getCity());
			
			
			pstm.executeUpdate();
            
            b = true;
			
		
		} 
		catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
		}
		
		
		return b;
	}

	
	
	public static boolean deleteStudentData(int id) {

		boolean b = false;
		
		try {
			
			Connection con = ConnectionProvider.connectionCreate();
			
			String query = "delete from students where sid = ?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setInt(1, id);
			
			pstm.executeUpdate();
			
			b = true;
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
		}
		
		return b;
	}



	public static boolean updateStudentData(StudentData st) {
		
		
		boolean b = false;
		
		 try {
			
			 Connection con = ConnectionProvider.connectionCreate();
			 
			 String query = "update students set sname = ?, mobileNo = ?, city = ? where sid = ?";
			 				
			 
			 PreparedStatement pstm = con.prepareStatement(query);
			 
			 pstm.setString(1, st.getsName());
			 pstm.setString(2, st.getsMobile());
			 pstm.setString(3, st.getCity());
			 pstm.setInt(4, st.getsId());
			 
			 pstm.executeUpdate();
			 
			 
			 b = true;
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
		return b;
	}
	
	
	
	public static void dispalyStudentData() {
		
		
		try {
			
			Connection con = ConnectionProvider.connectionCreate();
			
			String query = "select * from students";
			
			Statement st = con.createStatement();
			
			ResultSet set = st.executeQuery(query);
			
			while(set.next()){
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String mobile = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("Student Id : "+id);
				System.out.println("Student Name : "+name);
				System.out.println("Student Contact : "+mobile);
				System.out.println("Student city : "+city);
				System.out.println("------------------------------------------\n");
			}
			
			System.out.println("\n\n");
			
		} catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
		}
		
	
	}
	
	
}
