package package1;

public class Test {
	public void TuiKe(){
		System.out.println("�˿γɹ���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher(2020322060,"��־","��","2","��ѧ",3,1);
		Course course=new Course(2020322061,"��ԴУ��","����","֣��",12.05,4);
		Student student=new Student(2020322062,"����","Ů","2","��Ϣϵ",2);
//		Staff staff=new Staff(2020322063,"��־","Ů","2");
		student.setCourse(course);
		student.setT1(t);
		t.judge(t.coursenum);
		Test test=new Test();
		if(student.coursenum>1){
			System.out.println("ѡ�β��ɹ�,ֻ��ѡ��һ�ſγ�");
			
		}else{
			System.out.println("���ѳɹ�ѡ��!"+"\n"+student.toString());
		}
		if(student.coursenum==1&&student.coursenum>1){
			System.out.println("�����˿Σ�");
			test.TuiKe();
		}
		//else{
			//System.out.println("δ����ѡ�Σ��޷��˿Σ�");
		//}
//		System.out.println( student.coursenum+course.toString());
//		System.out.println(t);
//		System.out.println(student);
//		System.out.println(staff);
//		System.out.println(course);
		
	
	}

}
