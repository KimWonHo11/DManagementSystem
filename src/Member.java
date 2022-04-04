
public class Member {
	String Name;
	double Height;
	double Weight;
	double Bmi;
	String Number;
	int date;
	
	public Member() {
	}
	
	public Member(String Name,double Height) {
		this.Name = Name;
		this.Height = Height;
	}
	
	public Member(String Name, double Height, double Weight, double Bmi, String Number, int date) {
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.Bmi = Bmi;
		this.Number = Number;
		this.date = date;
	}
	
	public void print() {
		System.out.println("Name: " + Name + "Height " + Height + "Weight " + Weight + "Bmi " + Bmi + "Number " + Number + "date " + date);
	}

}
