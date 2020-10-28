package package1;

public class Student extends Staff {
	Teacher t1;
	Course course;
	String department;
	int coursenum;
	Student(int number,String name,String sex,String grade,String department,int coursenum){
		super(number,name,sex,grade);
//		this.course=course;
		this.department=department;
		this.coursenum=coursenum;
	}
//	public void judge(int coursenum){
//		this.coursenum=coursenum;
//		if(coursenum>1){
//			System.out.println("选课不成功,只能选择一科");
//			
//		}else{
//			System.out.println("你已成功选课");
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Teacher getT1() {
		return t1;
	}
	public void setT1(Teacher t1) {
		this.t1 = t1;
	}
	
	public int getCoursenum() {
		return coursenum;
	}
	public void setCoursenum(int coursenum) {
		this.coursenum = coursenum;
	}
	public String toString() {
		return super.toString()+course+t1;
	}

}
