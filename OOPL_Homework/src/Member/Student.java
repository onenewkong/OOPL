package Member;

import Team.Team;

public class Student extends Member{
	private int id;
	private String major;
	private int year;

	public Student(int id, String name, Team tm, String major, int year) {
		super(id, name, tm);
		this.major = major;
		this.year = year;
		this.id = id;
	}

	@Override
	public void ShowData() {
		System.out.println(this.id + "\t" + this.name + "\t" + this.tm.getTitle() + "\t" + this.major + "\t" + this.year);
	}
	
	public void Q1() {
		System.out.println("-------------------------------------");
		System.out.println("ID \t 이름 \t Team \t 전공 \t 학년");
		System.out.println("-------------------------------------");
		this.ShowData();
		System.out.println("-------------------------------------");
	}
}
