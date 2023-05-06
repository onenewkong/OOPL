package Team;

import java.util.Scanner;

public class TeamManager {
	private int index;
	private Team[] tList = new Team[50];
	
	public TeamManager() {
		super();
		this.index = 0;
		InitTeam();
	}
	
	public Team FindTeamByID(int id) {
		for (int i = 0; i < index; i++) {
			if (tList[i].getId() == id) {
				return tList[i];
			}
		}
		return null;
	}
	
	public boolean AddTeam(String title) {
		if(index < tList.length) {
			tList[index++] = new Team(index, title);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void AddTeam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- title: ");
		String title = sc.nextLine();
		
		if(AddTeam(title)) {
			System.out.println(">> ADDED");
		}
		
		else {
			System.out.println(">> FAILED");
		}
	}
	
	public void FindTeamByID() {
		Scanner sc  = new Scanner(System.in);
		System.out.print(" - Team ID: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("------------------------------------");
		System.out.println("ID \t Team 이름");
		System.out.println("------------------------------------");
		this.FindTeamByID(id).ShowData();
		System.out.println("------------------------------------");
	}
	
	public void InitTeam() {
		AddTeam("아침이다");
		AddTeam("점심먹고");
		AddTeam("놀다가자");
		AddTeam("꿈꾼다");
	}
	
	public void ShowTeam() {
		System.out.println("------------------------------------");
		System.out.println("ID \t Team 이름");
		System.out.println("------------------------------------");
		for(int i = 0; i < index; i++) {
			tList[i].ShowData();
		}
		System.out.println("------------------------------------");
	}
}
