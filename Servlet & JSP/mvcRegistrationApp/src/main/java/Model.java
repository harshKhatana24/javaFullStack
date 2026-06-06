import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {

    int id;
    String name;
    String email;
    String password;

    private Connection connection=null;
    private PreparedStatement pstmt=null;

    private int affectedRows;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public Model() {
    }


    public int register(){
        try
        {
            connection=JdbcUtilClass.getDBConnection();
            pstmt=connection.prepareStatement("""

INSERT INTO userregister(name,email,password) VALUES(?,?,?);

""");

//            pstmt.setInt(1, Math.round(10000));
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);

            affectedRows=pstmt.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally{
            JdbcUtilClass.closeResource(connection,pstmt);
        }


        return affectedRows;


    }







}
