package Q1;

import Member.Student;
import Team.Team;

public class MainCtrl {
	public static void main(String[] args) {
		Student st = new Student(1,"홍학생",new Team(1,"아침이다"),"소프트웨어",1); 
		st.Q1();
	}
}
