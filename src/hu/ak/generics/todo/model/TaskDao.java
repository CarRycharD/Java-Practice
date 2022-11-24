package hu.ak.generics.todo.model;

import java.util.List;

public interface TaskDao {

	Task getTaskById(int id);
	List<Task> listTasks();
	Task createTask(String summary);
	Task updateTaskFinisihed(int id);
	
}
