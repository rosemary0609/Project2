package package1;

public class Teacher extends Staff{
	
	String course;
	int age;
	int coursenum;

	Teacher(int number,String name,String sex,String grade,String course,int age,int coursenum){
		super(number,name,sex,grade);
		this.course=course;
		this.age=age;
		this.coursenum=coursenum;
		
	}
	public void judge(int coursenum){
		this.coursenum=coursenum;
		if(coursenum>1){
			System.out.println("超过所授课程数量");
			
		}else{
			System.out.println("老师只授一门课程");
		}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getCoursenum() {
		return coursenum;
	}
	public void setCoursenum(int coursenum) {
		this.coursenum = coursenum;
	}
	public String toString() {
		return "\nTeacher [number=" + number + ", name=" + name + ", sex=" + sex
				+ ", course=" + course + ", age=" + age + ", coursenum="
				+ coursenum + "]";
	}




}
