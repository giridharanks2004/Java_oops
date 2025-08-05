import java.sql.*;
import java.util.*;
class Database{
    private String url;
    private String username;
    private String password;

    public Database(){
        this.url ="jdbc:mysql://localhost:3306/jdbc_project";
        this.username = "root";
        this.password = "root123";
    }

    public void readAllRecords() throws Exception{
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
        con.close();
    }

    public void insertRecords() throws Exception{
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement("insert into employee values (?,?,?)");
        st.setString(1, "ENG22CS0322");
        st.setString(2,"Lalith JV");
        st.setString(3, "123456789");
        int rows = st.executeUpdate();
        System.out.println("no .of rows affected:"+rows);
        con.close();
    }

    public void deleteRecord() throws Exception{
        Connection con = DriverManager.getConnection(url, username, password);
        String Id = "ENG22CS0322";
        PreparedStatement st = con.prepareStatement("delete from employee where e_id = ?");
        st.setString(1, Id);
        int rows = st.executeUpdate();
        System.out.println("no. of rows affected "+ rows);
        con.close();
    }

    public void storedProcedure() throws Exception{
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement st = con.prepareCall("{call all_record()}");
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        con.close();
    }

    public void storedProcedure(String Id) throws Exception{
        Connection con = DriverManager.getConnection(url,username,password);
        CallableStatement st = con.prepareCall("{call id_record(?)}");
        st.setString(1, Id);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }

    }

    public void storedProcedureOut(String Id) throws Exception{
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement st = con.prepareCall("{call id_recordout(?,?)}");
        st.setString(1,Id);
        st.registerOutParameter(2, Types.VARCHAR);
        st.executeUpdate();
        System.out.println(st.getString(2));
    }

    public void UpdateSalary() throws Exception{
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement checkst = con.prepareStatement("select * from employee where e_id = ?");
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the employee id to be updated");
        String Id = inp.nextLine();
        checkst.setString(1, Id);
        ResultSet rs = checkst.executeQuery();
        if(rs.next()){
            con.setAutoCommit(false);
            System.out.println("id found enter the salary to be updated:");
            int salary = inp.nextInt();
            PreparedStatement updateSalary = con.prepareStatement("update employee set e_salary = ? where e_id = ?");
            updateSalary.setInt(1,salary);
            updateSalary.setString(2, Id);
            int rows = updateSalary.executeUpdate();
            if(rows>0){
                con.commit();
                System.out.println("no .of rows affected: "+rows);
            }else{
                con.rollback();
                System.out.println("database issues ur update will be handled");
            }
        }
        else{
            System.out.println("employee id is not found please re check and enter proper employee id.");
        }

        con.commit();
        con.close();
    }

}
public class jdbc_proj {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        //db.insertRecords();
        //db.storedProcedure();
        //db.storedProcedureOut("ENG22CS0322");
        db.UpdateSalary();
    }
}
