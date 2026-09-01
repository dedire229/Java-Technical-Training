package com.raunak.first_jdbc_project;

import java.sql.*;

public class JDBCMySQLConnector {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/world";
    String username = "root";
    String password = "Uemk2016!@#";
    int effectedRows = 0;

    String displayQuery = "SELECT * FROM city;";

//    String insertQuery = """
//        INSERT INTO
//          user_details
//        VALUES
//          (4, "Sujay", "+92 9332929292");
//        """;

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement st = con.createStatement();
//
//      System.out.println("Inserting data into the db...");
//      effectedRows = st.executeUpdate(insertQuery);

      ResultSet rs = st.executeQuery(displayQuery);
      System.out.println();

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int population = rs.getInt("population");
        System.out.println(id + " : " + name+" : "+population);
      }

      con.close();
      st.close();
      rs.close();
    } catch (SQLException e) {
      System.out.println("Something went wrong: \n" + e.getMessage());
    }
    finally {
      System.out.println();
      System.out.println(effectedRows + " is row effected");
    }
  }
}
