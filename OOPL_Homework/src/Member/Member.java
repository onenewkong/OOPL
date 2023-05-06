package Member;

import Show.Showable;
import Team.Team;

public abstract class Member implements Showable{
	protected int id;
	protected String name;
	protected Team tm;
	
	public Member(int id, String name, Team tm) {
		super();
		this.id = id;
		this.name = name;
		this.tm = tm;
	}

	public Team getTm() {
		return tm;
	}

	public void setTm(Team tm) {
		this.tm = tm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}