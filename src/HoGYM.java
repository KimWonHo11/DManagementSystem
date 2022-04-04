import java.util.Scanner;

public class HoGYM {
	Member Member;
	Scanner input;
	HoGYM(Scanner input) {
		this.input = input;
	}

	public void Addm() {
		Member= new Member();
		System.out.print("Member Name:");
		Member.Name = input.next();
		System.out.print("Member Height:");
		Member.Height = input.nextDouble();
		System.out.print("Member Weight:");
		Member.Weight = input.nextDouble();
		System.out.print("Member Bmi:");
		Member.Bmi = input.nextDouble();
		System.out.print("Member Phone Number:");
		Member.Number = input.next();
		System.out.print("Member Expiration Date:");
		Member.date = input.nextInt();
	}

	public void Delm() {
		System.out.print("Member Name:");
		String name = input.next();
		if (Member == null) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
		if (Member.Name.equals(name)) {
			Member= null;
			System.out.println("회원을 삭제했습니다.");
		}
	}

	public void Edim() {
		System.out.print("Member Name:");
		String name = input.next();
		if (Member.Name.equals(name) {
			System.out.println("수정된 회원:" + name);
		}
	}

	public void Viem() {
		System.out.print("Member Name:");
		String name = input.next();
		if(Member.Name.equals(name)) {
			Member.print();
		}
	}
}

