package package1;

public class Test {
	public void TuiKe(){
		System.out.println("退课成功！");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher(2020322060,"王志","男","2","哲学",3,1);
		Course course=new Course(2020322061,"清源校区","高数","郑娟",12.05,4);
		Student student=new Student(2020322062,"王高","女","2","信息系",2);
//		Staff staff=new Staff(2020322063,"王志","女","2");
		student.setCourse(course);
		student.setT1(t);
		t.judge(t.coursenum);
		Test test=new Test();
		if(student.coursenum>1){
			System.out.println("选课不成功,只能选择一门课程");
			
		}else{
			System.out.println("你已成功选课!"+"\n"+student.toString());
		}
		if(student.coursenum==1&&student.coursenum>1){
			System.out.println("可以退课！");
			test.TuiKe();
		}
		//else{
			//System.out.println("未进行选课，无法退课！");
		//}
//		System.out.println( student.coursenum+course.toString());
//		System.out.println(t);
//		System.out.println(student);
//		System.out.println(staff);
//		System.out.println(course);
		
	
	}

}
