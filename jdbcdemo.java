 import java.sql.*;

import com.mysql.cj.protocol.Resultset;

class jdbcdemo{
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/karthi";
        String user="root";
        String password="karthi@2308";
        String query="insert into friends(ID,name,DOB) values (?,?,?)";
        java.util.Date myDate = new java.util.Date("10/10/2009");
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, password);
        PreparedStatement st=con.prepareStatement(query);
         st.setInt(1,6);
         st.setString(2,"hariprasad");
         st.setDate(3,sqlDate);
         
        int count=st.executeUpdate();
        System.out.println(count+"rows affected");

       
        st.close();
        con.close();
        
    }
}