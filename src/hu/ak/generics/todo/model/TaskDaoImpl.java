package hu.ak.generics.todo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao {

	private Connection con;

	public TaskDaoImpl(Connection con) {
		this.con = con;
	}

	private Task dbToTask(ResultSet rs) {

		Task task = new Task();

		try {
			task.setId(rs.getInt(1));
			task.setSummary(rs.getString(2));
			task.setFinished(rs.getBoolean(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return task;

	}

	@Override
	public Task getTaskById(int id) {

		Task task = new Task();

		try (PreparedStatement ps = con.prepareStatement("SELECT * from task WHERE task_id = ?")) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				task = dbToTask(rs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return task;
	}

	@Override
	public List<Task> listTasks() {

		List<Task> list = new ArrayList<>();

		try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("SELECT * from task");) {

			while (rs.next()) {
				list.add(dbToTask(rs));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Task createTask(String summary) {

		try (PreparedStatement insertValues = con.prepareStatement("INSERT INTO task(summary) VALUES(?)")) {
			insertValues.setString(1, summary);
			insertValues.executeUpdate();

			try (PreparedStatement selectValues = con.prepareStatement("SELECT task_id FROM task WHERE summary = ? ")) {
				selectValues.setString(1, summary);
				try (ResultSet rs = selectValues.executeQuery()) {
					rs.next();
					Task task = getTaskById(rs.getInt(1));
					return task;
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Task updateTaskFinisihed(int id) {
		try (PreparedStatement ps = con.prepareStatement("UPDATE task SET finished = ? WHERE task_id = ? ;")) {
			ps.setInt(1, 1);
			ps.setInt(2, id);
			ps.executeUpdate();
			return getTaskById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
