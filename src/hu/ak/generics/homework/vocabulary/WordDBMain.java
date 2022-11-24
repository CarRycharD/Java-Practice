package hu.ak.generics.homework.vocabulary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordDBMain {

	private static final String URL = "jdbc:mysql://localhost:3306/vocabulary";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	private static final String CREATE_TABLE_SQL = """
			CREATE TABLE word(
			ID INT PRIMARY KEY AUTO_INCREMENT,
			value VARCHAR(10) NOT NULL UNIQUE
			);
			""";
	private static final String INSERT_SQL = "INSERT INTO word(value) VALUES(?);";
	private static final String SELECT_SQL = "SELECT * from word ORDER BY value";
	private static final String DROP_TABLE_SQL = "drop table word;";

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type in 5 words");
			for (int i = 0; i < 5; i++) {
				words.add(scanner.nextLine());
			}
		}

		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement stm = con.createStatement()) {

			stm.executeUpdate(CREATE_TABLE_SQL);

			for (String i : words) {
				try (PreparedStatement ps = con.prepareStatement(INSERT_SQL);) {
					ps.setString(1, i);
					ps.executeUpdate();
				}
			}

			try (ResultSet rs = stm.executeQuery(SELECT_SQL)) {

				while (rs.next()) {
					int id = rs.getInt(1);
					String value = rs.getString(2);
					System.out.println("| ID: " + id + " | Value: " + value + " |");
				}
			}

			stm.executeUpdate(DROP_TABLE_SQL);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
