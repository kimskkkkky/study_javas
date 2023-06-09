import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import commons.Commons;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "";
            // 작업키 입력
            Scanner scanner = new Scanner(System.in);
            String workkey = "P";
            while (!workkey.equals("E")) {
                System.out.print("선택입력 : ");
                workkey = scanner.nextLine();

                 if (workkey.equals("O")) {
                    System.out.println(" - 차 이름 명단 ");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t, T_CAR_INFOR.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tINNER JOIN car_infors AS T_CAR_INFOR ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID )";
                    ResultSet resultSet = statement.executeQuery(query);
                    int number = 1;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2;
                    String query2;
                    HashMap<String, String> carNumberMap = new HashMap<String, String>();
                    while (resultSet.next()) {
                        System.out.print(number + ". " +
                                resultSet.getString("COMPANY") + " - " +
                                resultSet.getString("CAR_NAME") + ": ");
                            String carInforId = resultSet.getString("CAR_INFOR_ID");
                            carNumberMap.put(String.valueOf(number), carInforId);
                            query2 = "SELECT T_OPT_INFO.OPTION_NAME\n" + //
                                    "FROM option_infors AS T_OPT_INFO\n" + //
                                    "\tINNER JOIN `options` AS T_OPTS\n" + //
                                    "\tON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID\n" + //
                                    "    AND T_OPTS.CAR_INFOR_ID ='"+carInforId+"'";
                        resultSet2 = statement2.executeQuery(query2);
                        while(resultSet2.next()){
                            System.out.print(resultSet2.getString("OPTION_NAME")+",");
                        }            
                        number = number + 1;
                        System.out.println();
                    }
                    // 차량 번호 입력
                    System.out.print("-차 이름 명단 : ");
                    String CarNumber = scanner.nextLine();
                    // System.out.println("차명 PK : "+carNumberMap.get(CarNumber));
                    System.out.println("-선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "FROM option_infors";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>();
                    while(resultSet.next()){
                        System.out.print(number +","+resultSet.getString("OPTION_NAME")+",");
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                    number = number + 1;
                    }
                    System.out.println(); 
                    System.out.print("-추가 옵션 선택 : ");
                    String optionnumber = scanner.nextLine();
                    System.out.println(carNumberMap.get(CarNumber)+", " + carOptionInfor.get(optionnumber));
                    String carPK = carNumberMap.get(CarNumber);
                    String optionPK = carOptionInfor.get(optionnumber);

                    //delete 옵션
                    query = "DELETE FROM `options`\n" + //
                            "WHERE CAR_INFOR_ID = '"+carPK+"' AND OPTION_INFOR_ID = '"+optionPK+"'";
                    int count = statement.executeUpdate(query);

                    //insert 옵션
                    //commons.java를 불러서 유니크 아이디를 매번 새로 생성
                    Commons commons = new Commons();
                    String optionId = commons.generateUUID();
                    query = "INSERT INTO `OPTIONS`\n" + //
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)\n" + //
                            "value\n" + //
                            "('"+optionId+"', '"+carPK+"', '"+optionPK+"')";
                    count = statement.executeUpdate(query);

                    System.out.println();

                } else if (workkey.equals("S")) {
                    System.out.println("- 통계 시작 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM factorys AS T_FAC\n" + //
                            "\tINNER JOIN car_infors AS T_CAR_INFOR\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID\n" + //
                            "    INNER JOIN `options` AS T_OPTS\n" + //
                            "    ON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "    GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID\n";
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") +
                                resultSet.getString("CAR_NAME") +
                                resultSet.getInt("CNT"));
                    }
                } else {
                    System.out.println("----- 작업 키 확인 : 입력한 값 : -----" + workkey);
                }
            }
            System.out.println("----- 작업종료 -----");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
