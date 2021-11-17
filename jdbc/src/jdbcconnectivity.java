import java.sql.*;

public class jdbcconnectivity {
    public static void main(String args[]){
        try{
            String Query="Select * from myschema.student";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myschema","root","root");
            System.out.println("Connection Established Successfully!!");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(Query);
            while(rs.next()){
            int Student_ID  = rs.getInt("Student_ID");
            String Student_Name = rs.getString("Student_Name");
             int Age = rs.getInt("Age");
            String Address = rs.getString("Address");
            String Branch = rs.getString("Branch");
                    
            //Display values
            System.out.print("Student_ID: " + Student_ID);
            System.out.print(",Student_Name: " + Student_Name);
            System.out.print(",Age: " + Age);
            System.out.print(", Address: " + Address);
            System.out.println(", Branch: " + Branch);
            };
           
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
