import java.sql.*;
class Main{
    public static void main(String[] args) throws Exception {
        

     String url="jdbc:mysql://localhost:3306/store";
     String user="root";
     String pass="karthi@2308";
     String query="SELECT * FROM customers";

     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection(url, user, pass);
     Statement st= con.createStatement();
     ResultSet rs=st.executeQuery(query);
     while(rs.next()){
     String name=rs.getString("first_name");
     System.out.println(name);}
     st.close();
     con.close();


    }
}
