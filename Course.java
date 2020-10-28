package package1;

public class Course {
	int number;
	String course;
	String address;
	String tutor;
	double time;
	int credit;
	
	Course(int number,String address,String course,String tutor,double time,int credit){
		this.number=number;
		this.course=course;
		this.address=address;
		this.tutor=tutor;
		this.time=time;
		this.credit=credit;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	

	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String toString() {
		return "\nCourse [number=" + number + ", course=" + course + ", address="
				+ address + ", tutor=" + tutor + ", time=" + time + ", credit="
				+ credit + "]";
	}



}
