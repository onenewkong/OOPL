package Member;

import Team.Team;

public class Mentor extends Member{
	private int id;
	private String org;
	
	public Mentor(int id, String name, Team tm, String org) {
		super(id, name, tm);
		this.org = org;
		this.id = id;
	}

	@Override
	public void ShowData() {
		System.out.println(this.id + "\t" + this.name + "\t" + this.tm.getTitle() + "\t" + this.org);
	}
}
