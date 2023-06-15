import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SurveysAPP {
    public static void main(String[] args) {
        try {
            
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("-----통계-----");
            // -- 총 설문자 3명
            String queryA = "SELECT count(*) AS CNT\n" + //
                            "FROM (SELECT RESPONDENTS_ID, count(*)\n" + //
                            "FROM statistics\n" + //
                            "GROUP BY RESPONDENTS_ID) AS T_STATIC\n";
            ResultSet resultSet = statement.executeQuery(queryA);
            while (resultSet.next()) {
                System.out.println("-- 총 설문자" + resultSet.getString("CNT"));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
