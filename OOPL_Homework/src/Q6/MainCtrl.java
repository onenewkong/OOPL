package Q6;

import Member.MemberManager;
import Team.TeamManager;

public class MainCtrl {
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		MemberManager mMgr = new MemberManager();
		TeamManager tMgr = new TeamManager();
		
		while(true) {
			switch(mm.IssueMenu()) {
			case 1: 
				mMgr.AddStudent(tMgr);
				break;
			case 2:
				mMgr.ShowStudent();
				break;
			case 3:
				mMgr.AddMentor(tMgr);
				break;
			case 4:
				mMgr.ShowMentor();
				break;
			case 5: 
				mMgr.FindMember();
				break;
			case 6:
				mMgr.ShowAll();
				break;
			case 7:
				tMgr.AddTeam();
				break;
			case 8:
				tMgr.ShowTeam();
				break;
			case 9:
				mMgr.ShowMemberByTeamID(tMgr);
				break;
			case 0:
				return;
			}
		}
	}
}
