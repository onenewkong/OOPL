package Member;

import java.util.Scanner;

import Team.Team;
import Team.TeamManager;

public class MemberManager {
	private int index;
	private Member[] mList = new Member[50];

	public MemberManager() {
		super();
		this.index = 0;
		this.InitMember();
	}
	
	public void InitMember() {
		this.AddStudent("홍학생",new Team(1,"아침이다"),"소프트웨어",1);
		this.AddStudent("김학생",new Team(2,"점심먹고"),"게임공학",2);
		this.AddStudent("박학생",new Team(1,"아침이다"),"컴퓨터공학",3);
		this.AddMentor("홍멘토",new Team(1,"아침이다"),"Happy co.");
		this.AddMentor("박멘토",new Team(3,"놀다가자"),"(주)행복");
	}

	public boolean AddStudent(String name, Team tm, String major, int year) {
		if (index < mList.length) {
			mList[index++] = new Student(index, name, tm, major, year);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean AddMentor(String name, Team tm, String org) {
		if (index < mList.length) {
			mList[index++] = new Mentor(index, name, tm, org);
			return true;
		} else {
			return false;
		}
	}

	public void AddStudent(TeamManager tMgr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<학생 멤버 추가>");
		System.out.println(" - ID: " + (index + 1));
		System.out.print(" - 이름: ");
		String name = sc.nextLine();
		System.out.print(" - 전공: ");
		String major = sc.nextLine();
		System.out.print(" - 학년: ");
		int year = Integer.parseInt(sc.nextLine());

		tMgr.ShowTeam();

		System.out.print(" - Team ID: ");
		int id = Integer.parseInt(sc.nextLine());
		Team tm = tMgr.FindTeamByID(id);

		if (tm == null) {
			System.out.println("Error");
			return;
		}

		if (this.AddStudent(name, tm, major, year)) {
			System.out.println("=> " + name + ": 학생을 추가했습니다.");
			return;
		}

		System.out.println("Add Student Error");
	}

	public void AddMentor(TeamManager tManager) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<멘토 멤버 추가>");
		System.out.println(" - ID: " + (index + 1));
		System.out.print(" - 이름: ");
		String name = sc.nextLine();
		System.out.print(" - 회사: ");
		String org = sc.nextLine();

		tManager.ShowTeam();

		System.out.print(" - Team ID: ");
		int id = Integer.parseInt(sc.nextLine());

		Team tm = tManager.FindTeamByID(id);

		if (tm == null) {
			System.out.println("Error");
			return;
		}

		if (this.AddMentor(name, tm, org)) {
			System.out.println("=> " + name + ": 멘토를 추가했습니다.");
			return;
		}

		System.out.println("Add Mentor Error");
	}

	public void ShowStudent() {
		System.out.println("<학생 멤버 목록>");
		System.out.println("-------------------------------");
		System.out.println("ID \t 이름 Team \t 전공 \t 학년");
		System.out.println("-------------------------------");
		for (int i = 0; i < index; i++) {
			if (mList[i] instanceof Student)
				mList[i].ShowData();
		}
		System.out.println("-------------------------------");
	}

	public void ShowMentor() {
		System.out.println("<멘토 멤버 목록>");
		System.out.println("-------------------------------");
		System.out.println("ID \t 이름 Team \t 회사");
		System.out.println("-------------------------------");
		for (int i = 0; i < index; i++) {
			if (mList[i] instanceof Mentor)
				mList[i].ShowData();
		}
		System.out.println("-------------------------------");
	}

	public void ShowMemberByTeamID(TeamManager tMgr) {
		Scanner sc = new Scanner(System.in);
		tMgr.ShowTeam();
		System.out.print("- Team ID: ");
		int id = Integer.parseInt(sc.nextLine());

		Team tm = tMgr.FindTeamByID(id);

		if (tm == null) {
			System.out.println("Error");
			return;
		}

		System.out.println("<" + tm.getTitle() + ": 멤버목록>");
		System.out.println("-----------------------------------------");
		System.out.println("구분 \t ID 이름 \t Team \t 전공/회사 \t 학년");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < index; i++) {
			if (mList[i].getTm().getId() == id) {
				mList[i].ShowData();
			}
		}
		System.out.println("-----------------------------------------");
	}

	public Member FindMember(String name) {

		for (int i = 0; i < index; i++) {
			if (name.equals(mList[i].getName())) {
				return mList[i];
			}
		}
		return null;
	}

	public void FindMember() {
		Scanner sc = new Scanner(System.in);

		System.out.print("- 이름: ");
		String searchName = sc.nextLine();

		Member m = this.FindMember(searchName);

		if (m == null) {
			System.out.println("Error");
			return;
		}
		System.out.println("<찾은 멤버>");
		System.out.println("-----------------------------------------------");
		System.out.println("구분 \t ID 이름 \t Team \t 전공/회사 \t 학년");
		System.out.println("-----------------------------------------------");
		m.ShowData();
		System.out.println("-----------------------------------------------");

	}

	public void ShowAll() {
		System.out.println("<모든 멤버 목록>");
		System.out.println("-----------------------------------------------");
		System.out.println("구분 \t ID 이름 \t Team \t 전공/회사 \t 학년");
		System.out.println("-----------------------------------------------");
		for (int i =0; i<index;i++) {
			this.mList[i].ShowData();
		}
		System.out.println("-----------------------------------------------");
	}
}
