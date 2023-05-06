package Team;

import Show.Showable;

public class Team implements Showable{
	private int id;
	private String title;
	
	public Team(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void ShowData() {
		System.out.println(this.id + "\t" + this.title);
	}
}
