package package1;

public class Staff {
	int number;
	String name;
	String sex;
	String grade;

	Staff(int number,String name,String sex,String grade){
		this.number=number;
		this.name=name;
		this.sex=sex;
		this.grade=grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		return "Staff [number=" + number + ", name=" + name + ", sex=" + sex
				+ ", grade=" + grade + "]";
	}

}
