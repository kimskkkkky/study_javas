import java.sql.*;

import cars.FactoryDMLs;

public class ConnectDBsWithMethod {
    public static void main(String[] args) {
        Connection connection;   
        Statement statement;
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            FactoryDMLs factoryDMLs = new FactoryDMLs();
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = factoryDMLs.selectStatements(statement, query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = factoryDMLs.insertstatement(statement, query);
            System.out.println();

            statement. close();
            connection.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {

        }
    // finally = 메모리 제외 모든걸 반납해야합. 인스턴스 한 순서 반대로. connection  =  statement  = DB 자원,
        System.out.println();
    }
}