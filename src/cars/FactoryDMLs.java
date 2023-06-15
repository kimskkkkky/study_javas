package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FactoryDMLs {
    public ResultSet selectStatements(Statement statement, String query) throws SQLException{
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public int insertstatement(Statement statement, String query) throws SQLException{
        int count = statement.executeUpdate(query);
        return count;
    }
    
}
// throws SQLException = 에러가 발생하면 본인을 호출한 애한테 에러를 던짐.