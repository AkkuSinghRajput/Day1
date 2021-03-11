
public class School {

	public static void main(String[] args) {
		/*System.out.println("Hello");
		Student student= new Student();
		student.setName("Ram");
		System.out.println(student.getName());
		student.study();
		*/
		/*for (int i=0; i<10; i++) {
			System.out.print(i);
			Teacher t= new Teacher();
			t.setName("Akanksha");
			System.out.println(t.getName() + " is teacher");
			
		}*/
		
		Teacher t= new Teacher();
		Student s= new Student();
		s.setName("Romy");
		t.setAge((byte) 25);
		s.setAge((byte) 18);
		
		System.out.println(s.getName()+ " is student");
		
		System.out.println(t.getAge()+" is the age of teacher.");
		System.out.println(s.getAge()+" is the age of student.");
		t.setSubject(t.getName() + " teaches Maths to "+ s.getName());
		System.out.println(t.getSubject());
		
		
	}

}
