package hu.ak.generics.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TodoListMain {

	private static final String URL = "jdbc:mysql://localhost:3306/todo";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			TaskDao taskDao = new TaskDaoImpl(con);
			Task task1 = taskDao.createTask("First Task");
			System.out.println(task1);
			Task task2 = taskDao.createTask("Second Task");
			System.out.println(task2);
			taskDao.updateTaskFinisihed(task1.getId());
			System.out.println("List of tasks:");
			List<Task> list = taskDao.listTasks();
			for (Task task : list) {
				System.out.println(task);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
