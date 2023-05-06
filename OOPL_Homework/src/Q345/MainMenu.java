package Q345;

import java.util.Scanner;

public class MainMenu {
	public int IssueMenu() {
		Scanner sc = new Scanner(System.in);
		int sel = -1;

		System.out.println("<<메 인 메 뉴>>");
		System.out.println(" 1. 학생 멤버 추가");
		System.out.println(" 2. 학생 멤버 목록 출력\n");
		System.out.println(" 3. 멘토 멤버 추가");
		System.out.println(" 4. 멘토 멤버 목록 출력\n");
		System.out.println(" 5. 멤버 조회");
		System.out.println(" 6. 전체 멤버 목록 출력\n");
		System.out.println(" 0. 종료");
		System.out.println("--------------------------");
		System.out.print("메뉴 번호? >> ");
		sel = Integer.parseInt(sc.nextLine());

		return sel;
	}
}
