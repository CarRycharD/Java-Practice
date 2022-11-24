package hu.ak.generics.todo.model;

import java.util.Objects;

public class Task {

	private int id;
	private String summary;
	private boolean finished;

	public Task(int id, String summary, boolean finished) {

		this.id = id;
		this.summary = summary;
		this.finished = finished;
	}
	
	public Task() {
		this.id = 0;
		this.summary = null;
		this.finished = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public int hashCode() {
		return Objects.hash(finished, id, summary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		return finished == other.finished && id == other.id && Objects.equals(summary, other.summary);
	}

	@Override
	public String toString() {
		return "Task | Id=" + id + " | Summary=" + summary + " | finished=" + finished + " |" ;
		
	}

}
