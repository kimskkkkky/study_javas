package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents(Statement statement){
     try {
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
        System.out.println(e.getMessage());
     }
        return 0;
    }
}
