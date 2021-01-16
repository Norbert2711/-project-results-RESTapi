//package com.project.results.manager;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DBManagerTest {
//
//    @Test
//    public void testConnect() throws SQLException {
//        //Given
//        //When
//        DbManager dbManager = DbManager.getInstance();
//        //Then
//        Assert.assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    public void getCopsFromSQLBase() throws SQLException {
//
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "SELECT * FROM COPS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet resultSet = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt("ID") + ", " +
//                    resultSet.getString("NAME") + ", " +
//                    resultSet.getString("LAST_NAME") + ", " +
//                    resultSet.getInt("LOGIN"));
//            counter++;
//        }
//
//        resultSet.close();
//        statement.close();
//        Assert.assertEquals(3, counter);
//    }
//
//}
